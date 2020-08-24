package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mTextView;
    Button mTopButton;
    Button mBottomButton;

    int mIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);
        mIndex = 1;

//        if(savedInstanceState != null){  
//            mIndex = savedInstanceState.getInt("Index");
//        }

        if(mIndex == 1){
            mTextView.setText(R.string.T1_Story);
            mTopButton.setText(R.string.T1_Ans1);
            mBottomButton.setText(R.string.T1_Ans2);
        }


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mIndex == 1 || mIndex == 2) {

                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    mIndex = 3;

                }
                else if(mIndex == 3){

                    mTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                    mIndex = 6; // I save this index in order to use it when we rotate the phone and save the status of the story rather than restart the story
                    Toast.makeText(getApplicationContext(),"Rotate the phone to restart!",Toast.LENGTH_SHORT).show();

                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mIndex == 1){

                    mTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mIndex = 2;

                }
                else if(mIndex == 2){

                    mTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                    mIndex = 4; // I save this index in order to use it when we rotate the phone and save the status of the story rather than restart the story
                    Toast.makeText(getApplicationContext(),"Rotate the phone to restart!",Toast.LENGTH_SHORT).show();

                }
                else if(mIndex == 3){

                    mTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                    mIndex = 5; // I save this index in order to use it when we rotate the phone and save the status of the story rather than restart the story
                    Toast.makeText(getApplicationContext(),"Rotate the phone to restart!",Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
      //  outState.putInt("Index",mIndex);

    }

}
