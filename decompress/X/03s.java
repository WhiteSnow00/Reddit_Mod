// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Bundle;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.graphics.Movie;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import com.bytedance.covode.number.Covode;
import android.content.res.Resources;

public class 03s extends Resources
{
    public final Resources LIZ;
    
    static {
        Covode.recordClassIndex(488);
    }
    
    public XmlResourceParser getAnimation(final int n) {
        return this.LIZ.getAnimation(n);
    }
    
    public boolean getBoolean(final int n) {
        return this.LIZ.getBoolean(n);
    }
    
    public int getColor(final int n) {
        return this.LIZ.getColor(n);
    }
    
    public ColorStateList getColorStateList(final int n) {
        return this.LIZ.getColorStateList(n);
    }
    
    public Configuration getConfiguration() {
        return this.LIZ.getConfiguration();
    }
    
    public float getDimension(final int n) {
        return this.LIZ.getDimension(n);
    }
    
    public int getDimensionPixelOffset(final int n) {
        return this.LIZ.getDimensionPixelOffset(n);
    }
    
    public int getDimensionPixelSize(final int n) {
        return this.LIZ.getDimensionPixelSize(n);
    }
    
    public DisplayMetrics getDisplayMetrics() {
        return this.LIZ.getDisplayMetrics();
    }
    
    public Drawable getDrawable(final int n) {
        return this.LIZ.getDrawable(n);
    }
    
    public Drawable getDrawable(final int n, final Resources$Theme resources$Theme) {
        return this.LIZ.getDrawable(n, resources$Theme);
    }
    
    public Drawable getDrawableForDensity(final int n, final int n2) {
        return this.LIZ.getDrawableForDensity(n, n2);
    }
    
    public Drawable getDrawableForDensity(final int n, final int n2, final Resources$Theme resources$Theme) {
        return this.LIZ.getDrawableForDensity(n, n2, resources$Theme);
    }
    
    public float getFraction(final int n, final int n2, final int n3) {
        return this.LIZ.getFraction(n, n2, n3);
    }
    
    public int getIdentifier(final String s, final String s2, final String s3) {
        return this.LIZ.getIdentifier(s, s2, s3);
    }
    
    public int[] getIntArray(final int n) {
        return this.LIZ.getIntArray(n);
    }
    
    public int getInteger(final int n) {
        return this.LIZ.getInteger(n);
    }
    
    public XmlResourceParser getLayout(final int n) {
        return this.LIZ.getLayout(n);
    }
    
    public Movie getMovie(final int n) {
        return this.LIZ.getMovie(n);
    }
    
    public String getQuantityString(final int n, final int n2) {
        return this.LIZ.getQuantityString(n, n2);
    }
    
    public String getQuantityString(final int n, final int n2, final Object... array) {
        return this.LIZ.getQuantityString(n, n2, array);
    }
    
    public CharSequence getQuantityText(final int n, final int n2) {
        return this.LIZ.getQuantityText(n, n2);
    }
    
    public String getResourceEntryName(final int n) {
        return this.LIZ.getResourceEntryName(n);
    }
    
    public String getResourceName(final int n) {
        return this.LIZ.getResourceName(n);
    }
    
    public String getResourcePackageName(final int n) {
        return this.LIZ.getResourcePackageName(n);
    }
    
    public String getResourceTypeName(final int n) {
        return this.LIZ.getResourceTypeName(n);
    }
    
    public String getString(final int n) {
        return this.LIZ.getString(n);
    }
    
    public String getString(final int n, final Object... array) {
        return this.LIZ.getString(n, array);
    }
    
    public String[] getStringArray(final int n) {
        return this.LIZ.getStringArray(n);
    }
    
    public CharSequence getText(final int n) {
        return this.LIZ.getText(n);
    }
    
    public CharSequence getText(final int n, final CharSequence charSequence) {
        return this.LIZ.getText(n, charSequence);
    }
    
    public CharSequence[] getTextArray(final int n) {
        return this.LIZ.getTextArray(n);
    }
    
    public void getValue(final int n, final TypedValue typedValue, final boolean b) {
        this.LIZ.getValue(n, typedValue, b);
    }
    
    public void getValue(final String s, final TypedValue typedValue, final boolean b) {
        this.LIZ.getValue(s, typedValue, b);
    }
    
    public void getValueForDensity(final int n, final int n2, final TypedValue typedValue, final boolean b) {
        this.LIZ.getValueForDensity(n, n2, typedValue, b);
    }
    
    public XmlResourceParser getXml(final int n) {
        return this.LIZ.getXml(n);
    }
    
    public TypedArray obtainAttributes(final AttributeSet set, final int[] array) {
        return this.LIZ.obtainAttributes(set, array);
    }
    
    public TypedArray obtainTypedArray(final int n) {
        return this.LIZ.obtainTypedArray(n);
    }
    
    public InputStream openRawResource(final int n) {
        return this.LIZ.openRawResource(n);
    }
    
    public InputStream openRawResource(final int n, final TypedValue typedValue) {
        return this.LIZ.openRawResource(n, typedValue);
    }
    
    public AssetFileDescriptor openRawResourceFd(final int n) {
        return this.LIZ.openRawResourceFd(n);
    }
    
    public void parseBundleExtra(final String s, final AttributeSet set, final Bundle bundle) {
        this.LIZ.parseBundleExtra(s, set, bundle);
    }
    
    public void parseBundleExtras(final XmlResourceParser xmlResourceParser, final Bundle bundle) {
        this.LIZ.parseBundleExtras(xmlResourceParser, bundle);
    }
    
    public void updateConfiguration(final Configuration configuration, final DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        final Resources liz = this.LIZ;
        if (liz != null) {
            liz.updateConfiguration(configuration, displayMetrics);
        }
    }
}
