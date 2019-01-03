package com.lissettelogsin.currencyconverter;


import android.content.Intent; //importing necessary libraries
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class CurrencyConversion extends AppCompatActivity { //Starting main class
    String currencyName;
    Button currencyButton; //creating android items
    RadioButton euros;
    RadioButton pesos;
    RadioButton won;
    RadioButton yen;
    RadioButton yuan;
    RadioGroup group;
    String currencyTotal = "Amount in " + currencyName;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Creating the app
        super.onCreate(savedInstanceState); //Bringing back the saved state of the app
        setContentView(R.layout.currency_chooser); //Connecting the layout of the android app to the Java code
        currencyButton = (Button) findViewById(R.id.button2); //Making Java objects out of Radio buttons
        euros = (RadioButton) findViewById(R.id.radioButton);
        pesos = (RadioButton) findViewById(R.id.radioButton2);
        won = (RadioButton) findViewById(R.id.radioButton3);
        yen = (RadioButton) findViewById(R.id.radioButton4);
        yuan = (RadioButton) findViewById(R.id.radioButton5);
        group = (RadioGroup) findViewById(R.id.radioGroup);

    }

    public void onCurrencyChosen(View v) { //What will happen when the currency is selected Submit button is  clicked

        int id = group.getCheckedRadioButtonId(); //Getting ID number of radio button from it's assigned radiogroup
        RadioButton chosenCurrencyOption = (RadioButton) group.findViewById(id);
        String currencyName = (String)chosenCurrencyOption.getText(); //Getting the name associated to the gathered id




        Intent intent = new Intent(this,MainActivity.class); //Once Submit is hit, this Intent will send the string to MainActivity
        intent.putExtra("CurrencyName", currencyName); //Assigning the String to a key
        startActivity(intent); //Starts sending the data to MainActivity
        Bundle extras = getIntent().getExtras(); //Gets data
        if(extras != null){
            String result = extras.getString("CurrencyName");
            System.out.print("Result sent" + result); //Confirming String has been sent to MainActivity

        }

    }

}