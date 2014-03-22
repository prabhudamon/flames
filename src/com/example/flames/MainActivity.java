package com.example.flames;

import java.io.BufferedReader;
import java.io.InputStreamReader;




import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		final Button ping;
		ping = (Button) findViewById(R.id.button1);
	
			   
				ping.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						   int m;
						  
						   EditText name1,name2;
						    TextView result;
						   result = (TextView) findViewById(R.id.op);
						 name1  = (EditText) findViewById(R.id.name1);
						    name2  = (EditText) findViewById(R.id.name2);
						    
						    String namea= name1.getText().toString();
						    String nameb = name2.getText().toString();
							StringBuffer s1=new StringBuffer(namea);
							StringBuffer s2=new StringBuffer(nameb);
							int a=s1.length();
							int b=s2.length();
						//comparing two names
						label: for(int i=0;i<a;i++)
						{
							char c=s1.charAt(i);
						//	System.out.println(c);
							for(int j=0;j<b;j++)
							{
								char d=s2.charAt(j);
								if(c==d)
								{
									 ////k++;
									 s1.deleteCharAt(i);
									 s2.deleteCharAt(j);
									 ////System.out.println(s1 +" " +s2);
									 a=s1.length();
									 //m=a;
									 b=s2.length();
									 i=0;
									 j=0;
									// continue label;
								}
										}

					////	System.out.println(k);
						}
					  int d=(a+b);
					  System.out.println("the number is : " +d);
					  //int n=-1,l=0,p=0;
					  StringBuffer s3=new StringBuffer("flames");
					  String s4=new String();

				label1:	for(int i=0;i<5;i++)
						{int n=-1,l=0,p=0;
							for(int j=1;j<=d;j++)
							{
							n++;
							l++;
							//int p=0;
							if(n>s3.length()-1)
								{
								char e=s3.charAt(p);
								if(l==d)
									{
									s3.deleteCharAt(p);
									//String s4=new String();
									s4=s3.substring(p,s3.length());
									////System.out.println(s4);
									s3.delete(p,s3.length());
									////System.out.println(s3);
									s3.insert(0,s4);
									////System.out.println(s3);
									break;
									}
									else{ p++;
									     if(p==s3.length())
									     {p=0;
									     }
				                        }
								}
							else
								{
								char e=s3.charAt(n);
								if(l==d)
									{
									s3.deleteCharAt(n);

									s4=s3.substring(n,s3.length());
									////System.out.println(s4);
									s3.delete(n,s3.length());
							    	////System.out.println(s3);
									s3.insert(0,s4);
									////System.out.println(s3);
							    	break;
									}
									//break;
					    		}

				    		}
				   		 }
				    ////System.out.println(s3);
				    char result1=s3.charAt(0);
				    switch(result1){
				    	case 'f':
				    	           result.setText("friends");
				    	     break;
				    	case 'l':
				    		 result.setText("loves");
				    		 break;
				        case 'a':
				        	 result.setText("affection");
				        	 break;
				        case 'm':
				        	 result.setText("marriage");
				        	 break;
				        case 'e':
				        	 result.setText("enemy");
				        	 break;
				        case 's':
				        	 result.setText("sister");
				        	 break;
				    		      }
					}
					

				});
	}

			    
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
