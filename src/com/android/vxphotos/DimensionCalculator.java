package com.android.vxphotos;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 *
 * Class to store and provide useful dimensions
 */
public class DimensionCalculator {

  private static int mScreenWidth;
  private static int mScreenHeight; 
  private static int mTileWidth;

  /**
   * This class is a singleton
   */
  public static DimensionCalculator getInstance() {
    return SingletonHolder.instance;
  }


  private static class SingletonHolder { 
    public static final DimensionCalculator instance = new DimensionCalculator();
  }

  public static int getWidth() {
     DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
     mScreenWidth = Math.min(dm.widthPixels, dm.heightPixels);
     return mScreenWidth; 
  }
  
  public static int getHeight() {
	  DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
	  mScreenHeight = Math.max(dm.widthPixels, dm.heightPixels);
	  return mScreenHeight; 
  }

  /**
   * Return the appropriate tile size for this device
   */
  
  public int getTileWidth() {
	  
	  DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();
	  mScreenWidth = Math.min(dm.widthPixels, dm.heightPixels);

	     int numTiles = 3;
	     int tileGap = 2;
	     mTileWidth = (int) ((mScreenWidth - 4 * tileGap) / numTiles);
    return mTileWidth;
  }
}