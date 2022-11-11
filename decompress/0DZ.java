// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PathMeasure;
import android.graphics.Path;
import android.animation.TimeInterpolator;
import android.view.animation.AnimationUtils;
import android.util.TypedValue;
import android.view.InflateException;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Keyframe;
import java.util.Iterator;
import android.animation.PropertyValuesHolder;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.content.res.Resources$NotFoundException;
import android.animation.AnimatorSet;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.animation.Animator;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0Dz
{
    static {
        Covode.recordClassIndex(1484);
    }
    
    public static Animator LIZ(final Context context, final Resources resources, final Resources$Theme resources$Theme, final int n) {
        XmlResourceParser xmlResourceParser = null;
        XmlResourceParser xmlResourceParser2 = null;
        XmlResourceParser animation = null;
        try {
            final XmlResourceParser xmlResourceParser3 = xmlResourceParser2 = (xmlResourceParser = (animation = resources.getAnimation(n)));
            return LIZ(context, resources, resources$Theme, (XmlPullParser)xmlResourceParser3, Xml.asAttributeSet((XmlPullParser)xmlResourceParser3), null, 0, 1.0f);
        }
        catch (final IOException ex) {
            xmlResourceParser2 = animation;
            xmlResourceParser2 = animation;
            xmlResourceParser2 = animation;
            final StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
            xmlResourceParser2 = animation;
            sb.append(Integer.toHexString(n));
            xmlResourceParser2 = animation;
            final Resources$NotFoundException ex2 = new Resources$NotFoundException(sb.toString());
            xmlResourceParser2 = animation;
            ex2.initCause((Throwable)ex);
            xmlResourceParser2 = animation;
            throw ex2;
        }
        catch (final XmlPullParserException ex3) {
            xmlResourceParser2 = xmlResourceParser;
            xmlResourceParser2 = xmlResourceParser;
            xmlResourceParser2 = xmlResourceParser;
            final StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
            xmlResourceParser2 = xmlResourceParser;
            sb2.append(Integer.toHexString(n));
            xmlResourceParser2 = xmlResourceParser;
            final Resources$NotFoundException ex4 = new Resources$NotFoundException(sb2.toString());
            xmlResourceParser2 = xmlResourceParser;
            ex4.initCause((Throwable)ex3);
            xmlResourceParser2 = xmlResourceParser;
            throw ex4;
        }
        finally {
            if (xmlResourceParser2 != null) {
                xmlResourceParser2.close();
            }
        }
    }
    
    public static Animator LIZ(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set, final AnimatorSet set2, final int n, final float n2) {
        final int depth = xmlPullParser.getDepth();
        Object o = null;
        ArrayList<AnimatorSet> list = null;
        int n3;
        while (true) {
            final int next = xmlPullParser.next();
            n3 = 0;
            int n4 = 0;
            if (next == 3) {
                if (xmlPullParser.getDepth() > depth) {
                    continue;
                }
                break;
            }
            else {
                if (next == 1) {
                    break;
                }
                if (next != 2) {
                    continue;
                }
                final String name = xmlPullParser.getName();
                Object o2;
                if (name.equals("objectAnimator")) {
                    o2 = LIZ(context, resources, resources$Theme, set, n2, xmlPullParser);
                }
                else if (name.equals("animator")) {
                    o2 = LIZ(context, resources, resources$Theme, set, null, n2, xmlPullParser);
                }
                else if (name.equals("set")) {
                    o2 = new AnimatorSet();
                    final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LJII);
                    LIZ(context, resources, resources$Theme, xmlPullParser, set, (AnimatorSet)o2, 06u.LIZ(liz, xmlPullParser, "ordering", 0, 0), n2);
                    liz.recycle();
                }
                else {
                    if (!name.equals("propertyValuesHolder")) {
                        final StringBuilder sb = new StringBuilder("Unknown animator name: ");
                        sb.append(xmlPullParser.getName());
                        throw new RuntimeException(sb.toString());
                    }
                    final PropertyValuesHolder[] liz2 = LIZ(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                    if (liz2 != null && o != null && o instanceof ValueAnimator) {
                        ((ValueAnimator)o).setValues(liz2);
                    }
                    n4 = 1;
                    o2 = o;
                }
                o = o2;
                if (set2 == null) {
                    continue;
                }
                o = o2;
                if (n4 != 0) {
                    continue;
                }
                ArrayList<AnimatorSet> list2;
                if ((list2 = list) == null) {
                    list2 = new ArrayList<AnimatorSet>();
                }
                list2.add((AnimatorSet)o2);
                list = list2;
                o = o2;
            }
        }
        if (set2 != null && list != null) {
            final Animator[] array = new Animator[list.size()];
            final Iterator<AnimatorSet> iterator = list.iterator();
            int n5 = n3;
            while (iterator.hasNext()) {
                array[n5] = (Animator)iterator.next();
                ++n5;
            }
            if (n == 0) {
                set2.playTogether(array);
            }
            else {
                set2.playSequentially(array);
            }
        }
        return (Animator)o;
    }
    
    public static Keyframe LIZ(final Keyframe keyframe, final float n) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(n);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(n);
        }
        return Keyframe.ofObject(n);
    }
    
    public static ObjectAnimator LIZ(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final float n, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = new ObjectAnimator();
        LIZ(context, resources, resources$Theme, set, (ValueAnimator)objectAnimator, n, xmlPullParser);
        return objectAnimator;
    }
    
    public static PropertyValuesHolder LIZ(final TypedArray typedArray, int n, int n2, final int n3, final String s) {
        final TypedValue peekValue = typedArray.peekValue(n2);
        boolean b;
        int type;
        if (peekValue != null) {
            b = true;
            type = peekValue.type;
        }
        else {
            b = false;
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n3);
        boolean b2;
        int type2;
        if (peekValue2 != null) {
            b2 = true;
            type2 = peekValue2.type;
        }
        else {
            b2 = false;
            type2 = 0;
        }
        while (true) {
            Label_0616: {
                int n4;
                if (n == 4) {
                    if ((!b || !LIZ(type)) && (!b2 || !LIZ(type2))) {
                        n = 0;
                        break Label_0616;
                    }
                    n4 = 3;
                }
                else if ((n4 = n) == 0) {
                    break Label_0616;
                }
                final int n5 = 0;
                n = n4;
                final int n6 = n5;
                PropertyValuesHolder propertyValuesHolder = null;
                if (n == 2) {
                    final String string = typedArray.getString(n2);
                    final String string2 = typedArray.getString(n3);
                    final 08T.b[] liziz = 08T.LIZIZ(string);
                    final 08T.b[] liziz2 = 08T.LIZIZ(string2);
                    if (liziz == null) {
                        if (liziz2 != null) {
                            propertyValuesHolder = PropertyValuesHolder.ofObject(s, (TypeEvaluator)new a(), new Object[] { liziz2 });
                        }
                    }
                    else {
                        final a a = new a();
                        if (liziz2 != null) {
                            if (!08T.LIZ(liziz, liziz2)) {
                                final StringBuilder sb = new StringBuilder(" Can't morph from ");
                                sb.append(string);
                                sb.append(" to ");
                                sb.append(string2);
                                throw new InflateException(sb.toString());
                            }
                            propertyValuesHolder = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { liziz, liziz2 });
                        }
                        else {
                            propertyValuesHolder = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { liziz });
                        }
                    }
                }
                else {
                    Object liz;
                    if (n == 3) {
                        liz = 0E0.LIZ;
                    }
                    else {
                        liz = null;
                    }
                    PropertyValuesHolder propertyValuesHolder2;
                    if (n6 != 0) {
                        if (b) {
                            float n7;
                            if (type == 5) {
                                n7 = typedArray.getDimension(n2, 0.0f);
                            }
                            else {
                                n7 = typedArray.getFloat(n2, 0.0f);
                            }
                            if (b2) {
                                float n8;
                                if (type2 == 5) {
                                    n8 = typedArray.getDimension(n3, 0.0f);
                                }
                                else {
                                    n8 = typedArray.getFloat(n3, 0.0f);
                                }
                                propertyValuesHolder2 = PropertyValuesHolder.ofFloat(s, new float[] { n7, n8 });
                            }
                            else {
                                propertyValuesHolder2 = PropertyValuesHolder.ofFloat(s, new float[] { n7 });
                            }
                        }
                        else {
                            float n9;
                            if (type2 == 5) {
                                n9 = typedArray.getDimension(n3, 0.0f);
                            }
                            else {
                                n9 = typedArray.getFloat(n3, 0.0f);
                            }
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(s, new float[] { n9 });
                        }
                    }
                    else if (b) {
                        if (type == 5) {
                            n = (int)typedArray.getDimension(n2, 0.0f);
                        }
                        else if (LIZ(type)) {
                            n = typedArray.getColor(n2, 0);
                        }
                        else {
                            n = typedArray.getInt(n2, 0);
                        }
                        if (b2) {
                            if (type2 == 5) {
                                n2 = (int)typedArray.getDimension(n3, 0.0f);
                            }
                            else if (LIZ(type2)) {
                                n2 = typedArray.getColor(n3, 0);
                            }
                            else {
                                n2 = typedArray.getInt(n3, 0);
                            }
                            propertyValuesHolder2 = PropertyValuesHolder.ofInt(s, new int[] { n, n2 });
                        }
                        else {
                            propertyValuesHolder2 = PropertyValuesHolder.ofInt(s, new int[] { n });
                        }
                    }
                    else {
                        if (!b2) {
                            return propertyValuesHolder;
                        }
                        if (type2 == 5) {
                            n = (int)typedArray.getDimension(n3, 0.0f);
                        }
                        else if (LIZ(type2)) {
                            n = typedArray.getColor(n3, 0);
                        }
                        else {
                            n = typedArray.getInt(n3, 0);
                        }
                        propertyValuesHolder2 = PropertyValuesHolder.ofInt(s, new int[] { n });
                    }
                    propertyValuesHolder = propertyValuesHolder2;
                    if (propertyValuesHolder2 != null) {
                        propertyValuesHolder = propertyValuesHolder2;
                        if (liz != null) {
                            propertyValuesHolder2.setEvaluator((TypeEvaluator)liz);
                            propertyValuesHolder = propertyValuesHolder2;
                        }
                    }
                }
                return propertyValuesHolder;
            }
            final int n6 = 1;
            continue;
        }
    }
    
    public static ValueAnimator LIZ(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final ValueAnimator valueAnimator, final float n, final XmlPullParser xmlPullParser) {
        final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LJI);
        final TypedArray liz2 = 06u.LIZ(resources, resources$Theme, set, 0Dt.LJIIJ);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        LIZ(valueAnimator2, liz, liz2, n, xmlPullParser);
        final int liziz = 06u.LIZIZ(liz, xmlPullParser, "interpolator", 0);
        if (liziz > 0) {
            valueAnimator2.setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(context, liziz));
        }
        liz.recycle();
        if (liz2 != null) {
            liz2.recycle();
        }
        return valueAnimator2;
    }
    
    public static void LIZ(final ValueAnimator valueAnimator, final TypedArray typedArray, final TypedArray typedArray2, final float n, final XmlPullParser xmlPullParser) {
        final long duration = 06u.LIZ(typedArray, xmlPullParser, "duration", 1, 300);
        final long startDelay = 06u.LIZ(typedArray, xmlPullParser, "startOffset", 2, 0);
        final int liz = 06u.LIZ(typedArray, xmlPullParser, "valueType", 7, 4);
        if (06u.LIZ(xmlPullParser, "valueFrom") && 06u.LIZ(xmlPullParser, "valueTo")) {
            int n2;
            if ((n2 = liz) == 4) {
                final TypedValue peekValue = typedArray.peekValue(5);
                boolean b;
                int type;
                if (peekValue != null) {
                    b = true;
                    type = peekValue.type;
                }
                else {
                    b = false;
                    type = 0;
                }
                final TypedValue peekValue2 = typedArray.peekValue(6);
                boolean b2;
                int type2;
                if (peekValue2 != null) {
                    b2 = true;
                    type2 = peekValue2.type;
                }
                else {
                    b2 = false;
                    type2 = 0;
                }
                if ((b && LIZ(type)) || (b2 && LIZ(type2))) {
                    n2 = 3;
                }
                else {
                    n2 = 0;
                }
            }
            final PropertyValuesHolder liz2 = LIZ(typedArray, n2, 5, 6, "");
            if (liz2 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[] { liz2 });
            }
        }
        valueAnimator.setDuration(duration);
        valueAnimator.setStartDelay(startDelay);
        valueAnimator.setRepeatCount(06u.LIZ(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(06u.LIZ(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            final ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator;
            final String lizj = 06u.LIZJ(typedArray2, xmlPullParser, "pathData", 1);
            if (lizj != null) {
                final String lizj2 = 06u.LIZJ(typedArray2, xmlPullParser, "propertyXName", 2);
                final String lizj3 = 06u.LIZJ(typedArray2, xmlPullParser, "propertyYName", 3);
                if (lizj2 != null || lizj3 != null) {
                    LIZ(08T.LIZ(lizj), objectAnimator, 0.5f * n, lizj2, lizj3);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append(typedArray2.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            else {
                objectAnimator.setPropertyName(06u.LIZJ(typedArray2, xmlPullParser, "propertyName", 0));
            }
        }
    }
    
    public static void LIZ(final Path path, final ObjectAnimator objectAnimator, float n, final String s, final String s2) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final ArrayList list = new ArrayList();
        final float n2 = 0.0f;
        list.add(0.0f);
        float n3 = 0.0f;
        float n4;
        do {
            n4 = n3 + pathMeasure.getLength();
            list.add(n4);
            n3 = n4;
        } while (pathMeasure.nextContour());
        final PathMeasure pathMeasure2 = new PathMeasure(path, false);
        final int min = Math.min(100, (int)(n4 / n) + 1);
        final float[] array = new float[min];
        final float[] array2 = new float[min];
        final float[] array3 = new float[2];
        final float n5 = n4 / (min - 1);
        int n6 = 0;
        int n7 = 0;
        n = n2;
        PropertyValuesHolder propertyValuesHolder;
        while (true) {
            propertyValuesHolder = null;
            if (n6 >= min) {
                break;
            }
            pathMeasure2.getPosTan(n - (float)list.get(n7), array3, (float[])null);
            array[n6] = array3[0];
            array2[n6] = array3[1];
            n += n5;
            final int n8 = n7 + 1;
            int n9 = n7;
            if (n8 < list.size()) {
                n9 = n7;
                if (n > (float)list.get(n8)) {
                    pathMeasure2.nextContour();
                    n9 = n8;
                }
            }
            ++n6;
            n7 = n9;
        }
        PropertyValuesHolder ofFloat;
        if (s != null) {
            ofFloat = PropertyValuesHolder.ofFloat(s, array);
        }
        else {
            ofFloat = null;
        }
        PropertyValuesHolder ofFloat2 = propertyValuesHolder;
        if (s2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(s2, array2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat2 });
            return;
        }
        if (ofFloat2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat });
            return;
        }
        objectAnimator.setValues(new PropertyValuesHolder[] { ofFloat, ofFloat2 });
    }
    
    public static void LIZ(final Keyframe[] array, float n, int i, final int n2) {
        n /= n2 - i + 2;
        while (i <= n2) {
            array[i].setFraction(array[i - 1].getFraction() + n);
            ++i;
        }
    }
    
    public static boolean LIZ(final int n) {
        return n >= 28 && n <= 31;
    }
    
    public static PropertyValuesHolder[] LIZ(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set) {
        ArrayList list = null;
        int eventType;
        ArrayList list2;
        TypedArray liz;
        String lizj;
        int liz2;
        int n;
        ArrayList list3;
        int next;
        int n2;
        ArrayList list4;
        TypedArray liz3;
        TypedValue liz4;
        TypedArray liz5;
        float liz6;
        TypedValue liz7;
        boolean b;
        Keyframe keyframe;
        int liziz;
        int size;
        Keyframe keyframe2;
        Keyframe keyframe3;
        float fraction;
        int n3;
        float fraction2;
        int n4;
        Keyframe[] array;
        Keyframe keyframe4;
        int n5;
        int n6;
        int n7;
        PropertyValuesHolder ofKeyframe;
        PropertyValuesHolder liz8;
        Label_0802_Outer:Label_0828_Outer:
        while (true) {
            eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            }
            else {
                list2 = list;
                Label_0833: {
                    if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                        liz = 06u.LIZ(resources, resources$Theme, set, 0Dt.LJIIIIZZ);
                        lizj = 06u.LIZJ(liz, xmlPullParser, "propertyName", 3);
                        n = (liz2 = 06u.LIZ(liz, xmlPullParser, "valueType", 2, 4));
                        list3 = null;
                        while (true) {
                            next = xmlPullParser.next();
                            if (next == 3 || next == 1) {
                                break;
                            }
                            n2 = liz2;
                            list4 = list3;
                            Label_0366: {
                                if (xmlPullParser.getName().equals("keyframe")) {
                                    if ((n2 = liz2) == 4) {
                                        liz3 = 06u.LIZ(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), 0Dt.LJIIIZ);
                                        liz4 = 06u.LIZ(liz3, xmlPullParser, "value");
                                        if (liz4 != null && LIZ(liz4.type)) {
                                            n2 = 3;
                                        }
                                        else {
                                            n2 = 0;
                                        }
                                        liz3.recycle();
                                    }
                                    liz5 = 06u.LIZ(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), 0Dt.LJIIIZ);
                                    liz6 = 06u.LIZ(liz5, xmlPullParser, "fraction", 3, -1.0f);
                                    liz7 = 06u.LIZ(liz5, xmlPullParser, "value");
                                    if (liz7 != null) {
                                        b = true;
                                    }
                                    else {
                                        b = false;
                                    }
                                    while (true) {
                                        Label_0431: {
                                            Label_0405: {
                                                if (n2 == 4) {
                                                    if (!b) {
                                                        break Label_0431;
                                                    }
                                                    if (!LIZ(liz7.type)) {
                                                        break Label_0405;
                                                    }
                                                }
                                                else if (b) {
                                                    if (n2 == 0) {
                                                        break Label_0405;
                                                    }
                                                    if (n2 != 1 && n2 != 3) {
                                                        keyframe = null;
                                                        break Label_0291;
                                                    }
                                                }
                                                else {
                                                    if (n2 == 0) {
                                                        break Label_0431;
                                                    }
                                                    keyframe = Keyframe.ofInt(liz6);
                                                    break Label_0291;
                                                }
                                                keyframe = Keyframe.ofInt(liz6, 06u.LIZ(liz5, xmlPullParser, "value", 0, 0));
                                                liziz = 06u.LIZIZ(liz5, xmlPullParser, "interpolator", 1);
                                                if (liziz > 0) {
                                                    keyframe.setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(context, liziz));
                                                }
                                                liz5.recycle();
                                                list4 = list3;
                                                if (keyframe != null) {
                                                    if ((list4 = list3) == null) {
                                                        list4 = new ArrayList();
                                                    }
                                                    list4.add(keyframe);
                                                }
                                                xmlPullParser.next();
                                                break Label_0366;
                                            }
                                            keyframe = Keyframe.ofFloat(liz6, 06u.LIZ(liz5, xmlPullParser, "value", 0, 0.0f));
                                            continue Label_0802_Outer;
                                        }
                                        keyframe = Keyframe.ofFloat(liz6);
                                        continue Label_0802_Outer;
                                    }
                                }
                            }
                            liz2 = n2;
                            list3 = list4;
                        }
                        while (true) {
                            while (true) {
                                Label_0856: {
                                    if (list3 == null) {
                                        break Label_0856;
                                    }
                                    size = list3.size();
                                    if (size <= 0) {
                                        break Label_0856;
                                    }
                                    keyframe2 = (Keyframe)list3.get(0);
                                    keyframe3 = (Keyframe)list3.get(size - 1);
                                    fraction = keyframe3.getFraction();
                                    n3 = size;
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe3.setFraction(1.0f);
                                            n3 = size;
                                        }
                                        else {
                                            list3.add(list3.size(), LIZ(keyframe3, 1.0f));
                                            n3 = size + 1;
                                        }
                                    }
                                    fraction2 = keyframe2.getFraction();
                                    n4 = n3;
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe2.setFraction(0.0f);
                                            n4 = n3;
                                        }
                                        else {
                                            list3.add(0, LIZ(keyframe2, 0.0f));
                                            n4 = n3 + 1;
                                        }
                                    }
                                    array = new Keyframe[n4];
                                    list3.toArray(array);
                                    for (int i = 0; i < n4; ++i) {
                                        keyframe4 = array[i];
                                        if (keyframe4.getFraction() < 0.0f) {
                                            if (i == 0) {
                                                keyframe4.setFraction(0.0f);
                                            }
                                            else {
                                                n5 = n4 - 1;
                                                if (i == n5) {
                                                    keyframe4.setFraction(1.0f);
                                                }
                                                else {
                                                    n6 = i + 1;
                                                    n7 = i;
                                                    while (n6 < n5 && array[n6].getFraction() < 0.0f) {
                                                        n7 = n6;
                                                        ++n6;
                                                    }
                                                    LIZ(array, array[n7 + 1].getFraction() - array[i - 1].getFraction(), i, n7);
                                                }
                                            }
                                        }
                                    }
                                    ofKeyframe = PropertyValuesHolder.ofKeyframe(lizj, array);
                                    if (liz2 == 3) {
                                        ofKeyframe.setEvaluator((TypeEvaluator)0E0.LIZ);
                                        liz8 = ofKeyframe;
                                    }
                                    else if ((liz8 = ofKeyframe) == null) {
                                        break Label_0856;
                                    }
                                    if ((list2 = list) == null) {
                                        list2 = new ArrayList();
                                    }
                                    list2.add(liz8);
                                    liz.recycle();
                                    break Label_0833;
                                }
                                liz8 = LIZ(liz, n, 0, 1, lizj);
                                list2 = list;
                                if (liz8 != null) {
                                    continue Label_0828_Outer;
                                }
                                break;
                            }
                            continue;
                        }
                    }
                }
                xmlPullParser.next();
                list = list2;
            }
        }
        PropertyValuesHolder[] array3;
        if (list != null) {
            final int size2 = list.size();
            final PropertyValuesHolder[] array2 = new PropertyValuesHolder[size2];
            int n8 = 0;
            while (true) {
                array3 = array2;
                if (n8 >= size2) {
                    break;
                }
                array2[n8] = (PropertyValuesHolder)list.get(n8);
                ++n8;
            }
        }
        else {
            array3 = null;
        }
        return array3;
    }
    
    public static final class a implements TypeEvaluator<08T.b[]>
    {
        public 08T.b[] LIZ;
        
        static {
            Covode.recordClassIndex(1485);
        }
    }
}
