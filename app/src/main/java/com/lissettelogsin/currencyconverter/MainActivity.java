package com.lissettelogsin.currencyconverter;

import android.content.Intent; //importing necessary libraries
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity { //Starting main class
    TextView convertedTotal; //Where converted total is placed
    EditText textField; //Where US Dollar amount is typed
    Button convertButton; //Button that initiates the conversion
    String currencyString; //The choice of currency selected in the previous activity

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Creating the app
        super.onCreate(savedInstanceState); //Bringing back the saved state of the app
        setContentView(R.layout.activity_main); //Connecting the layout of the android app to the Java code
        convertedTotal = (TextView) findViewById(R.id.textView); //Attaching Java variables to the text field, converted total display, and convert button
        textField = (EditText) findViewById(R.id.editText);
        convertButton = (Button) findViewById(R.id.button);
Intent chosenCurrency = getIntent(); //Getting data from Intent set in last activity
String neededCurrency = chosenCurrency.getExtras().getString("CurrencyName"); //Tying currency selected to variable in this activity


        String receivedMessage = "Amount in " + neededCurrency; //Default display

        convertedTotal.setText(receivedMessage);
        currencyString = neededCurrency;



        convertButton.setOnClickListener( new View.OnClickListener(){ //instructions for when Convert button is clicked

            public void onClick(View v) {
                double convertedMoney = 0; //Setting variable to hold converted total
                String finalConversion = "Amount in  " + currencyString + " : " + String.valueOf(convertedMoney);
                if (currencyString.equals("Euros")) {
                    convertedMoney = parseDouble(textField.getText().toString()) * .87;
                    finalConversion = "Amount in " + currencyString + " : " + String.valueOf(convertedMoney);
                    convertedTotal.setText(finalConversion);

                }

                if (currencyString.equals("Pesos")) {
                    convertedMoney = parseDouble(textField.getText().toString()) * 20.26;
                    finalConversion = "Amount in " + currencyString + " : " + String.valueOf(convertedMoney);
                    convertedTotal.setText(finalConversion);
                }

                if (currencyString.equals("Won")) {
                    convertedMoney = parseDouble(textField.getText().toString()) * 1122.78;
                    finalConversion = "Amount in " + currencyString + " : " + String.valueOf(convertedMoney);
                    convertedTotal.setText(finalConversion);
                }
                if (currencyString.equals("Yen")){
                    convertedMoney = parseDouble(textField.getText().toString()) * 112.27;
                    finalConversion = "Amount in " + currencyString + " : " + String.valueOf(convertedMoney);
                    convertedTotal.setText(finalConversion);
                }
                if (currencyString.equals("Yuan")) {
                    convertedMoney = parseDouble(textField.getText().toString()) * 6.88;
                    finalConversion = "Amount in " + currencyString + " : " + String.valueOf(convertedMoney);
                    convertedTotal.setText(finalConversion);
                }
            }
            });
            }




    }


