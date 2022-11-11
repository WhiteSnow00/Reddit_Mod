// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.InvocationTargetException;
import androidx.lifecycle.SavedStateHandleController;
import java.util.Map;
import java.util.HashMap;
import androidx.lifecycle.AndroidViewModel;
import java.util.Arrays;
import java.lang.reflect.Constructor;
import com.bytedance.covode.number.Covode;
import android.os.Bundle;
import android.app.Application;

public final class 1g7 extends c
{
    public static final Class<?>[] LJFF;
    public static final Class<?>[] LJI;
    public final Application LIZ;
    public final b LIZIZ;
    public final Bundle LIZJ;
    public final 0CC LIZLLL;
    public final 0GO LJ;
    
    static {
        Covode.recordClassIndex(1233);
        LJFF = new Class[] { Application.class, 0Bl.class };
        LJI = new Class[] { 0Bl.class };
    }
    
    public 1g7(final Application liz, final 17e 17e, final Bundle lizj) {
        this.LJ = 17e.getSavedStateRegistry();
        this.LIZLLL = 17e.getLifecycle();
        this.LIZJ = lizj;
        this.LIZ = liz;
        b liziz;
        if (liz != null) {
            liziz = 0Bu.a.LIZ(liz);
        }
        else {
            liziz = 0Bu.d.LIZ();
        }
        this.LIZIZ = liziz;
    }
    
    public static <T> Constructor<T> LIZ(final Class<T> clazz, final Class<?>[] array) {
        for (final Constructor constructor : clazz.getConstructors()) {
            if (Arrays.equals(array, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }
    
    @Override
    public final <T extends 0Bq> T LIZ(final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return ((0Bu.c)this).LIZ(canonicalName, clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    @Override
    public final <T extends 0Bq> T LIZ(final String s, final Class<T> clazz) {
        final boolean assignable = AndroidViewModel.class.isAssignableFrom(clazz);
        Constructor<T> constructor;
        if (assignable && this.LIZ != null) {
            constructor = LIZ(clazz, 1g7.LJFF);
        }
        else {
            constructor = LIZ(clazz, 1g7.LJI);
        }
        if (constructor == null) {
            return this.LIZIZ.LIZ(clazz);
        }
        final 0GO lj = this.LJ;
        final 0CC lizlll = this.LIZLLL;
        final Bundle lizj = this.LIZJ;
        final Bundle liz = lj.LIZ(s);
        0Bl 0Bl;
        if (liz == null && lizj == null) {
            0Bl = new 0Bl();
        }
        else {
            final HashMap hashMap = new HashMap();
            if (lizj != null) {
                for (final String s2 : lizj.keySet()) {
                    hashMap.put(s2, X.0Bl.LIZ(lizj, s2));
                }
            }
            if (liz == null) {
                0Bl = new 0Bl(hashMap);
            }
            else {
                final ArrayList parcelableArrayList = liz.getParcelableArrayList("keys");
                final ArrayList parcelableArrayList2 = liz.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i = 0; i < parcelableArrayList.size(); ++i) {
                    hashMap.put(parcelableArrayList.get(i), parcelableArrayList2.get(i));
                }
                0Bl = new 0Bl(hashMap);
            }
        }
        final SavedStateHandleController savedStateHandleController = new SavedStateHandleController(s, 0Bl);
        savedStateHandleController.LIZ(lj, lizlll);
        SavedStateHandleController.LIZIZ(lj, lizlll);
        Label_0342: {
            if (assignable) {
                break Label_0342;
            }
            try {
                0Bq 0Bq = null;
                Label_0318: {
                    0Bq = constructor.newInstance(savedStateHandleController.LIZIZ);
                }
                while (true) {
                    0Bq.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                    return (T)0Bq;
                    final Application liz2 = this.LIZ;
                    iftrue(Label_0318:)(liz2 == null);
                    0Bq = constructor.newInstance(liz2, savedStateHandleController.LIZIZ);
                    continue;
                }
            }
            catch (final InvocationTargetException ex) {
                throw new RuntimeException("An exception happened in constructor of ".concat(String.valueOf(clazz)), ex.getCause());
            }
            catch (final InstantiationException ex2) {
                final StringBuilder sb = new StringBuilder("A ");
                sb.append(clazz);
                sb.append(" cannot be instantiated.");
                throw new RuntimeException(sb.toString(), ex2);
            }
            catch (final IllegalAccessException ex3) {
                throw new RuntimeException("Failed to access ".concat(String.valueOf(clazz)), ex3);
            }
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }
    
    @Override
    public final void LIZ(final 0Bq 0Bq) {
        SavedStateHandleController.LIZ(0Bq, this.LJ, this.LIZLLL);
    }
}
