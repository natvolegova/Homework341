package com.example.homework341;

import android.app.Activity;
import android.content.Intent;

public class Utils
{
    private static int sTheme;

    public final static int THEME_DEFAULT = 0;
    public final static int THEME_GREEN = 1;
    public final static int THEME_BLUE = 2;

    public static void changeToTheme(Activity activity, int theme)
    {
        sTheme = theme;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(Activity activity)
    {
        switch (sTheme)
        {
            default:
            case THEME_DEFAULT:
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_GREEN:
                activity.setTheme(R.style.AppThemeGreen);
                break;
            case THEME_BLUE:
                activity.setTheme(R.style.AppThemeBlue);
                break;
        }
    }
}