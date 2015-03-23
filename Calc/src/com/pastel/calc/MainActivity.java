package com.pastel.calc;


import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

import android.app.Activity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;


/*
 * Advanced Android Calculator using Arity Library
 * Developed By Vijay Kumar N
 * March 2015
 */


public class MainActivity extends Activity {
	
	EditText input;
	EditText result;
	String temp="";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		result=(EditText)findViewById(R.id.txtResult);
		input=(EditText)findViewById(R.id.txtInput);
		
	}

		
	public void entry(View view) throws SyntaxException{
	
		switch(view.getId()){
		
		case R.id.btn0: 
			temp+="0";
			input.setText(temp.toString());
		break;
		
		case R.id.btn1: 
			temp+="1";
			input.setText(temp);
		break;
		
		case R.id.btn2: 
			temp+="2";
			input.setText(temp);
		break;
		
		case R.id.btn3: 
			temp+="3";
			input.setText(temp);
		break;
		
		case R.id.btn4: 
			temp+="4";
			input.setText(temp);
		break;
		
		case R.id.btn5:
			temp+="5";
			input.setText(temp);
		break;
		
		case R.id.btn6: 
			temp+="6";
			input.setText(temp);
		break;
		
		case R.id.btn7: 
			temp+="7";
			input.setText(temp);
		break;
		
		case R.id.btn8: 
			temp+="8";
			input.setText(temp);
		break;
		
		case R.id.btn9:
			temp+="9";
			input.setText(temp);
		break;
		
		case R.id.btnPlus:
			temp+="\u002B";
			input.setText(temp);
		break;

		case R.id.btnMin:
			temp+="\u2212";
			input.setText(temp);
		break;
		
		case R.id.btnMul: 
			temp+="\u00D7";
			input.setText(temp);
		break;
		
		case R.id.btnDiv: 
			temp+="\u00F7";
			input.setText(temp);
		break;
		
		case R.id.btnCos:
			temp+="cos(";
			input.setText(temp);
		break;
		
		case R.id.btnPow:
		
			temp+="^";
			input.setText(temp);
		break;
		
		case R.id.btnOPara: 
			temp+="(";
			input.setText(temp);
		break;
		
		case R.id.btnCPara:
			temp+=")";
			input.setText(temp);
		break;
		
		case R.id.btnSqrt:
			temp+="\u221A";
			input.setText(temp);
		break;
		
		case R.id.btnPi: 
			temp+="\u03C0";
			input.setText(temp);
		break;
		
		case R.id.btnNot:
			temp+="!";
			input.setText(temp);
		break;
		
		case R.id.btnSin:
			temp+="sin(";
			input.setText(temp);
		break;
		
		case R.id.btnTan: 
			temp+="tan(";
			input.setText(temp);
		break;
		
		case R.id.btnLn:
			temp+="ln(";
			input.setText(temp);
		break;
		
		case R.id.btnLog:
			temp+="log(";
			input.setText(temp);
		break;
		
		case R.id.btnE: 
			temp+="e(";
			input.setText(temp);
		break;
		
		case R.id.btnDel:
			if(temp!=null && temp.length()>1){
				temp=temp.substring(0,temp.length()-1);
				input.setText(temp);
			}
		
		break;
		
		case R.id.btnEquals:
			result();
		break;
		
		case R.id.btnDot:
			temp+=".";
			input.setText(temp);
		break;
		
		case R.id.btnClr:
			temp=" ";
			input.setText(temp);
			result.setText(null);
		break;
		}
	}
	
	//Function which compute infix expression
	public void result(){
		Symbols symbols = new Symbols();
		double value=0;
		try {
			value = symbols.eval(temp);
		} catch (SyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.setText(String.valueOf(value));
	}
}
