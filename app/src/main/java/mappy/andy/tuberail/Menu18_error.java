package mappy.andy.tuberail;
   
import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;  
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle; 
import android.util.FloatMath;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Menu18_error extends Activity implements OnTouchListener {
	   private static final String TAG = "Touch";
	   // These matrices will be used to move and zoom image
	   Matrix matrix = new Matrix(); 
	   Matrix savedMatrix = new Matrix(); 
	   // We can be in one of these 3 states
	   static final int NONE = 0;
	   static final int DRAG = 1;
	   static final int ZOOM = 2;
	   int mode = NONE;

	   // Remember some things for zooming
	   PointF start = new PointF();
	   PointF mid = new PointF();
	   float oldDist = 1f;
	   ImageView view;
//	   float zoom = 0.5f;
	   float scale = 0.3f; 

	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      try {
	      setContentView(R.layout.menu18_error);
		    Context mContext = getApplicationContext();
//		   	BitmapDrawable d = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.p1);
		      Display display = getWindowManager().getDefaultDisplay();
		      float disWidth = display.getWidth();
		      float disHeight = display.getHeight();
		    view = (ImageView) findViewById(R.id.imageView18error);
	      view.setOnTouchListener(this);

	        scale = 1.0f;  
  	//	Toast.makeText(getApplicationContext()," disWidth "+disWidth,Toast.LENGTH_LONG).show();

	        //      Log.d("2222screeeenWirdthhhhhhh"," is " +disWidth);

	                scale = 0.4f;
	                if(disWidth<=321){ // 320 is my mini Alcatel pop C1
	                  	scale = 0.1f;
	               //   	matrix.setScale(scale,scale);   
	                 // 	matrix.postTranslate(-600, -800);	      
	                  }
	                if(disWidth<=721 && disWidth>=322){ // 720 is my Motorolla G, quite big screen
	                  	scale = 0.27f;
	               //   	matrix.setScale(scale,scale);   
	                 // 	matrix.postTranslate(-600, -800);	      
	                  }
matrix.setScale(scale,scale); 
//matrix.postTranslate(-1100.0f, -600.0f);
	      view.setImageMatrix(matrix);
	      } catch(Exception e){
	    	startActivity(new Intent(this, GeneralErrorMessage.class )); // dummy error pic
	    	finish();
//	    		Toast.makeText(getApplicationContext()," Sorry, your phoine does not have enough VM memory  "+e,Toast.LENGTH_LONG).show();
	    		// TODO
	    	}
	   }
	    // start title bar button calls
		   public void Menu4_Method(View v) {
			   	try {
		    		startActivity(new Intent(this, Menu4.class ));  
		    		finish();

			   	} catch(Exception e) {
			   		
			   	}}
		   public void Menu1_Method(View v) { 
			   	try {
		    		startActivity(new Intent(this, Menu1.class ));
		    		finish();
			   	} catch(Exception e) {
			   		
			   	}} 
		   public void Menu5_Method(View v) { 
			   	try {
		    		startActivity(new Intent(this, Menu5.class ));
		    		finish();
			   	} catch(Exception e) {
			   		
			   	}} 	
		   public void Menu6_Method(View v) { 
			   	try {
		    		startActivity(new Intent(this, Menu6.class ));
		    		finish();
			   	} catch(Exception e) {
			   		
			   	}} 
		   public void Menu9_Method(View v) { 
			   	try {
		    		startActivity(new Intent(this, Menu9.class ));
		    		finish();
			   	} catch(Exception e) {
			   		
			   	}} 
		   public void Menu8_Method(View v) { // zoom +
//		Toast.makeText(getApplicationContext()," clicked btn222222222222222222 ",Toast.LENGTH_SHORT).show();
			   	try {
		    		startActivity(new Intent(this, Menu8.class ));
		    		finish();


			   	} catch(Exception e) {
			   	}
			   	    }

			   public void Menu2_Method(View v) { // zoom -
				   	try {
			    		startActivity(new Intent(this, mappy.andy.tuberail.Menu2.class ));  
			    		finish();
				   	} catch(Exception e) {
				   		
				   	}}   
			   public void Menu7_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu7.class ));  
			    		finish();
		      		savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu3_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu3.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu10_Method(View v) {
					  try {
						    String stringy = getString(R.string.app_name);
						   	Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:rodsit@gmail.com"));
						 	intent.putExtra("subject", "Maps feedback for "+stringy);
						 	intent.putExtra("body", "Dear Bill, "+stringy+" is a great App. Thank you. " );
						 	startActivity(intent);
							  } catch(Exception e) {
								  
							  }
						  }

			// cam buttons start
			   public void Menu11_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu11.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu12_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu12.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu13_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu13.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu14_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu14.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu15_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu15.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu16_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu16.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu17_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu17.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu18_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu18.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu19_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu19.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   public void Menu20_Method(View v) {
				   	try {
			    		startActivity(new Intent(this, Menu20.class ));  
			    		finish();
		      	//	savedMatrix.set(matrix);

				   	} catch(Exception e) {
				   		
				   	}}
			   // cam buttons end
	//end button calls
	   @Override
	   public boolean onTouch(View v, MotionEvent event) {
	      ImageView view = (ImageView) v;
	 try {
	      // Dump touch event to log
	    //  dumpEvent(event);

	      // Handle touch events here...
	      switch (event.getAction() & MotionEvent.ACTION_MASK) {
	      case MotionEvent.ACTION_DOWN:
	         savedMatrix.set(matrix);
	         start.set(event.getX(), event.getY());
	         // Log.d(TAG, "mode=DRAG");
	         mode = DRAG;
	         break;
	      case MotionEvent.ACTION_POINTER_DOWN:
	         oldDist = spacing(event);
	         // Log.d(TAG, "oldDist=" + oldDist);
	         if (oldDist > 10f) {
	            savedMatrix.set(matrix);
	            midPoint(mid, event);
	            mode = ZOOM;
	            // Log.d(TAG, "mode=ZOOM");
	         }
	         break;
	      case MotionEvent.ACTION_UP:
	      case MotionEvent.ACTION_POINTER_UP:
	         mode = NONE;
	         // Log.d(TAG, "mode=NONE");
	         break;
	      case MotionEvent.ACTION_MOVE:
	         if (mode == DRAG) {
	            // ...
	            matrix.set(savedMatrix);
	            matrix.postTranslate(event.getX() - start.x,
	                  event.getY() - start.y);
	         }
	         else if (mode == ZOOM) {
	            float newDist = spacing(event);
	            // Log.d(TAG, "newDist=" + newDist);
	            if (newDist > 10f) {
	               matrix.set(savedMatrix);
	               float scale = newDist / oldDist;
	               matrix.postScale(scale, scale, mid.x, mid.y);
	            }
	         }
	         break;
	      }

	      view.setImageMatrix(matrix);
	   } catch(Exception e){
			// trying to use a recycled bitmap?
		}
	      return true; // indicate event was handled
	   }
	 
		@Override
		public void onDestroy() {
			super.onDestroy();
			System.gc();

		}
		@Override
		public void onPause() {
			super.onPause();
			System.gc();

		}
		@Override
		public void onStop() {
			super.onStop();
			System.gc();

		}

	   /** Determine the space between the first two fingers */
	   private float spacing(MotionEvent event) {
	      float x = event.getX(0) - event.getX(1);
	      float y = event.getY(0) - event.getY(1);
	      return FloatMath.sqrt(x * x + y * y);
	   }

	   /** Calculate the mid point of the first two fingers */
	   private void midPoint(PointF point, MotionEvent event) {
	      float x = event.getX(0) + event.getX(1);
	      float y = event.getY(0) + event.getY(1);
	      point.set(x / 2, y / 2);
	   }
	   @Override
	   public boolean onCreateOptionsMenu(Menu menu) {
	       super.onCreateOptionsMenu(menu);
	      MenuInflater inflater = getMenuInflater();  
	      inflater.inflate(R.menu.menu, menu);
	       return true;
	   }
	   /**
	    * Called right before your activity's option menu is displayed.
	    */  
	   @Override
	   public boolean onPrepareOptionsMenu(Menu menu) {  
	 
	       return true;  
	   } 
	   /**
	    * Called when a menu item is selected.
	    */
	   @Override
	   public boolean onOptionsItemSelected(MenuItem item){  
	       switch (item.getItemId()) { 

	       case R.id.email:
	     	Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:rodsit@gmail.com"));
	     	intent.putExtra("subject", "Hello Bill, Android developer");
	     	intent.putExtra("body", "Dear Bill, Its about the Berlin Subway map.... " );
	     	startActivity(intent); 
	   		break;

	       case R.id.exit:
	           finish();
	       break;          
	   }  
	       return true;  
	   }  
	}
