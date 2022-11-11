// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import androidx.appcompat.widget.an;
import X.04X;
import androidx.appcompat.widget.AppCompatTextView;
import X.03E;
import X.038;
import X.04U;
import X.04T;
import X.04Q;
import androidx.appcompat.widget.AppCompatImageView;
import X.04P;
import X.04N;
import X.04K;
import X.037;
import X.13a;
import X.04I;
import X.02V;
import android.content.res.TypedArray;
import android.view.View$OnClickListener;
import android.content.ContextWrapper;
import X.13j;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public class AppCompatViewInflater
{
    public static final String[] sClassPrefixList;
    public static final Map<String, Constructor<? extends View>> sConstructorMap;
    public static final Class<?>[] sConstructorSignature;
    public static final int[] sOnClickAttrs;
    public final Object[] mConstructorArgs;
    
    static {
        Covode.recordClassIndex(252);
        sConstructorSignature = new Class[] { Context.class, AttributeSet.class };
        sOnClickAttrs = new int[] { 16843375 };
        sClassPrefixList = new String[] { "android.widget.", "android.view.", "android.webkit." };
        sConstructorMap = new 13j<String, Constructor<? extends View>>();
    }
    
    public AppCompatViewInflater() {
        this.mConstructorArgs = new Object[2];
    }
    
    private void checkOnClickListener(final View view, final AttributeSet set) {
        final Context context = view.getContext();
        if (context instanceof ContextWrapper && view.hasOnClickListeners()) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, AppCompatViewInflater.sOnClickAttrs);
            final String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener((View$OnClickListener)new AppCompatViewInflater.a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    private View createViewByPrefix(final Context context, final String s, String string) {
        final Map<String, Constructor<? extends View>> sConstructorMap = AppCompatViewInflater.sConstructorMap;
        Label_0102: {
            Constructor<? extends View> constructor;
            if ((constructor = sConstructorMap.get(s)) != null) {
                break Label_0102;
            }
            Label_0069: {
                if (string == null) {
                    string = s;
                    break Label_0069;
                }
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(s);
                    string = sb.toString();
                    constructor = Class.forName(string, false, context.getClassLoader()).asSubclass(View.class).getConstructor(AppCompatViewInflater.sConstructorSignature);
                    sConstructorMap.put(s, constructor);
                    constructor.setAccessible(true);
                    return (View)constructor.newInstance(this.mConstructorArgs);
                }
                catch (final Exception ex) {
                    return null;
                }
            }
        }
    }
    
    private View createViewFromTag(final Context context, final String s, final AttributeSet set) {
        String attributeValue = s;
        if (s.equals("view")) {
            attributeValue = set.getAttributeValue((String)null, "class");
        }
        try {
            final Object[] mConstructorArgs = this.mConstructorArgs;
            mConstructorArgs[0] = context;
            mConstructorArgs[1] = set;
            if (-1 != attributeValue.indexOf(46)) {
                return this.createViewByPrefix(context, attributeValue, null);
            }
            int n = 0;
            while (true) {
                final String[] sClassPrefixList = AppCompatViewInflater.sClassPrefixList;
                if (n >= sClassPrefixList.length) {
                    return null;
                }
                final View viewByPrefix = this.createViewByPrefix(context, attributeValue, sClassPrefixList[n]);
                if (viewByPrefix != null) {
                    return viewByPrefix;
                }
                ++n;
            }
        }
        catch (final Exception ex) {
            return null;
        }
        finally {
            final Object[] mConstructorArgs2 = this.mConstructorArgs;
            mConstructorArgs2[1] = (mConstructorArgs2[0] = null);
        }
    }
    
    public static Context themifyContext(final Context context, final AttributeSet set, final boolean b, final boolean b2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16842752, 16842970, 2130970715, 2130970716, 2130971229 }, 0, 0);
        int resourceId;
        if (b) {
            resourceId = obtainStyledAttributes.getResourceId(0, 0);
        }
        else {
            resourceId = 0;
        }
        int resourceId2 = resourceId;
        if (b2 && (resourceId2 = resourceId) == 0) {
            resourceId2 = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        Object o = context;
        if (resourceId2 != 0) {
            if (context instanceof 02V) {
                o = context;
                if (((02V)context).LIZ == resourceId2) {
                    return (Context)o;
                }
            }
            o = new 02V(context, resourceId2);
        }
        return (Context)o;
    }
    
    private void verifyNotNull(final View view, final String s) {
        if (view != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(s);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }
    
    public 04I createAutoCompleteTextView(final Context context, final AttributeSet set) {
        return new 04I(context, set);
    }
    
    public 13a createButton(final Context context, final AttributeSet set) {
        return new 13a(context, set);
    }
    
    public 037 createCheckBox(final Context context, final AttributeSet set) {
        return new 037(context, set);
    }
    
    public 04K createCheckedTextView(final Context context, final AttributeSet set) {
        return new 04K(context, set);
    }
    
    public 04N createEditText(final Context context, final AttributeSet set) {
        return new 04N(context, set);
    }
    
    public 04P createImageButton(final Context context, final AttributeSet set) {
        return new 04P(context, set);
    }
    
    public AppCompatImageView createImageView(final Context context, final AttributeSet set) {
        return new AppCompatImageView(context, set);
    }
    
    public 04Q createMultiAutoCompleteTextView(final Context context, final AttributeSet set) {
        return new 04Q(context, set);
    }
    
    public 04T createRadioButton(final Context context, final AttributeSet set) {
        return new 04T(context, set);
    }
    
    public 04U createRatingBar(final Context context, final AttributeSet set) {
        return new 04U(context, set);
    }
    
    public 038 createSeekBar(final Context context, final AttributeSet set) {
        return new 038(context, set);
    }
    
    public 03E createSpinner(final Context context, final AttributeSet set) {
        return new 03E(context, set);
    }
    
    public AppCompatTextView createTextView(final Context context, final AttributeSet set) {
        return new AppCompatTextView(context, set);
    }
    
    public 04X createToggleButton(final Context context, final AttributeSet set) {
        return new 04X(context, set);
    }
    
    public View createView(final Context context, final String s, final AttributeSet set) {
        return null;
    }
    
    public final View createView(View view, final String s, final Context context, final AttributeSet set, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        Context context2;
        if (b && view != null) {
            context2 = view.getContext();
        }
        else {
            context2 = context;
        }
        Context themifyContext = null;
        Label_0039: {
            if (!b2) {
                themifyContext = context2;
                if (!b3) {
                    break Label_0039;
                }
            }
            themifyContext = themifyContext(context2, set, b2, b3);
        }
        if (b4) {
            an.LIZ(themifyContext);
        }
        s.hashCode();
        Label_0190: {
            switch (s) {
                case "RatingBar": {
                    view = (View)this.createRatingBar(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "CheckedTextView": {
                    view = (View)this.createCheckedTextView(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "MultiAutoCompleteTextView": {
                    view = (View)this.createMultiAutoCompleteTextView(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "TextView": {
                    view = (View)this.createTextView(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "ImageButton": {
                    view = (View)this.createImageButton(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "SeekBar": {
                    view = (View)this.createSeekBar(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "Spinner": {
                    view = (View)this.createSpinner(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "RadioButton": {
                    view = (View)this.createRadioButton(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "ToggleButton": {
                    view = (View)this.createToggleButton(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "ImageView": {
                    view = (View)this.createImageView(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "AutoCompleteTextView": {
                    view = (View)this.createAutoCompleteTextView(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "CheckBox": {
                    view = (View)this.createCheckBox(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "EditText": {
                    view = (View)this.createEditText(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                case "Button": {
                    view = (View)this.createButton(themifyContext, set);
                    this.verifyNotNull(view, s);
                    break Label_0190;
                }
                default:
                    break;
            }
            view = this.createView(themifyContext, s, set);
        }
        View viewFromTag = view;
        if (view == null) {
            if (context == themifyContext) {
                return view;
            }
            viewFromTag = this.createViewFromTag(themifyContext, s, set);
            if ((view = viewFromTag) == null) {
                return view;
            }
        }
        this.checkOnClickListener(viewFromTag, set);
        view = viewFromTag;
        return view;
    }
}
