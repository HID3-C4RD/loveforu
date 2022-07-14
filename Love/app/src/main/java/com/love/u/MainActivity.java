package com.love.u;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import java.util.*;

import android.app.AlertDialog;


public class MainActivity extends Activity {
	private Timer _timer = new Timer();

	private String endStr = "";
	private double i = 0;
	private boolean y = false;

	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ImageView imageview2;
	private TextView textview1;
	private TextView textview2;
	private ImageView imageview4;
	private ImageView imageview1;
	private ImageView imageview5;

	private TimerTask tmr;
	private MediaPlayer mud;
	private AlertDialog.Builder h;
	private Intent ii = new Intent();
	private TimerTask t;

	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}

	private void initialize(Bundle _savedInstanceState) {
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		h = new AlertDialog.Builder(this);

		imageview1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					if (y) {
						y = false;
						mud.pause();
						imageview1.setImageResource(R.drawable.ic_love_blue);
					}
					else {
						y = true;
						mud = MediaPlayer.create(getApplicationContext(), R.raw.crush);
						imageview1.setImageResource(R.drawable.image_1_2);
						mud.start();
					}
				}
			});
	}

	private void initializeLogic() {
		_TypeWriterEffect("I love baby.I promise you that I will love you.I love You for all that your all that you have been and all you're yet to be.Your my sun,my moon.You're my world,you're my true.You're everything to me.You're my light in the darkness.You're my peace ,happness.Do you know that how much I love you.\nI love you more than I can say.\n\nPlease Can you love me🥺\nCan you answer for me.\nI waiting for you.\n\nPleas love me.And you can think for me.\n", textview2, 200);
		textview1.setText("Love my frigg ❣️");
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/one.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/love.ttf"), 0);
		tmr = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {

											}
										});
								}
							};
							_timer.schedule(tmr, (int)(100));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {

											}
										});
								}
							};
							_timer.schedule(tmr, (int)(1000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {

											}
										});
								}
							};
							_timer.schedule(tmr, (int)(2000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {

											}
										});
								}
							};
							_timer.schedule(tmr, (int)(3000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {

											}
										});
								}
							};
							_timer.schedule(tmr, (int)(4000));
						}
					});
			}
		};
		_timer.scheduleAtFixedRate(tmr, (int)(0), (int)(4000));
	}

	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		switch (_requestCode) {

			default:
				break;
		}
	}

	@Override
	public void onStart() {
		super.onStart();
		h.setTitle("Frigg ❣️");
		h.setMessage("You can listen for song,that you click red heart.");
		h.setPositiveButton("ok", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {

				}
			});
		h.create().show();
		tmr = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview4.setImageResource(R.drawable.lov1);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(1000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview4.setImageResource(R.drawable.love_2);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(2000));
						}
					});
			}
		};
		_timer.scheduleAtFixedRate(tmr, (int)(100), (int)(2000));
		tmr = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview5.setImageResource(R.drawable.lov2);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(1000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview5.setImageResource(R.drawable.love_1);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(2000));
						}
					});
			}
		};
		_timer.scheduleAtFixedRate(tmr, (int)(100), (int)(2000));
		tmr = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview2.setImageResource(R.drawable.love1);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(1000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview2.setImageResource(R.drawable.love2);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(2000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview2.setImageResource(R.drawable.love2);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(3000));
							tmr = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
											@Override
											public void run() {
												imageview2.setImageResource(R.drawable.love3);
											}
										});
								}
							};
							_timer.schedule(tmr, (int)(4000));
						}
					});
			}
		};
		_timer.scheduleAtFixedRate(tmr, (int)(100), (int)(4000));
	}

	@Override
	public void onBackPressed() {
		h.setTitle("Frigg ❣️");
		h.setMessage("Do you love me? ");
		h.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					ii.setAction(Intent.ACTION_VIEW);
					ii.setData(Uri.parse("fb://profile/100012367980020"));
					startActivity(ii);
					finishAffinity();
				}
			});
		h.setNegativeButton("No", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {

				}
			});
		h.create().show();
	}
	public void _TypeWriterEffect (final String _Text, final TextView _tw, final double _delay) {
		endStr = "";
		i = 0;
		tmr = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
						@Override
						public void run() {
							if (!(i == _Text.length())) {
								String jg = ""+_Text;

								char ug = jg.charAt((int) i);

								endStr = endStr+""+ug;

								_tw.setText(endStr);

								/*

								 Created by JulianFun123

								 - interaapps.de

								 Short Long links with PunyShort.ga

								 If you want to share code, use pastefy.ga

								 */
								i++;
							}
							else {
								tmr.cancel();
							}
						}
					});
			}
		};
		_timer.scheduleAtFixedRate(tmr, (int)(_delay), (int)(_delay));
	}


	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}

	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}

	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}

	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}

	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
				_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}

	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}

	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}

	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}

