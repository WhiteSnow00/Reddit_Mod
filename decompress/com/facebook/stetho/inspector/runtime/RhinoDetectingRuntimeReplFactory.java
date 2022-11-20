// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.runtime;

import com.facebook.stetho.inspector.console.RuntimeRepl;
import com.facebook.stetho.common.LogUtil;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import com.facebook.stetho.inspector.console.RuntimeReplFactory;

public class RhinoDetectingRuntimeReplFactory implements RuntimeReplFactory
{
    private final Context mContext;
    private RuntimeException mRhinoJsUnexpectedError;
    private RuntimeReplFactory mRhinoReplFactory;
    private boolean mSearchedForRhinoJs;
    
    public RhinoDetectingRuntimeReplFactory(final Context mContext) {
        this.mContext = mContext;
    }
    
    public static RuntimeException access$000(final RhinoDetectingRuntimeReplFactory rhinoDetectingRuntimeReplFactory) {
        return rhinoDetectingRuntimeReplFactory.mRhinoJsUnexpectedError;
    }
    
    private static RuntimeReplFactory findRhinoReplFactory(final Context context) throws RuntimeException {
        try {
            return (RuntimeReplFactory)Class.forName("com.facebook.stetho.rhino.JsRuntimeReplFactoryBuilder").getDeclaredMethod("defaultFactory", Context.class).invoke(null, context);
        }
        catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        catch (final InvocationTargetException ex2) {
            throw new RuntimeException(ex2);
        }
        catch (final NoSuchMethodException ex3) {
            throw new RuntimeException(ex3);
        }
        catch (final ClassNotFoundException ex4) {
            LogUtil.i("Error finding stetho-js-rhino, cannot enable console evaluation!");
            return null;
        }
    }
    
    public RuntimeRepl newInstance() {
        if (!this.mSearchedForRhinoJs) {
            this.mSearchedForRhinoJs = true;
            try {
                this.mRhinoReplFactory = findRhinoReplFactory(this.mContext);
            }
            catch (final RuntimeException mRhinoJsUnexpectedError) {
                this.mRhinoJsUnexpectedError = mRhinoJsUnexpectedError;
            }
        }
        final RuntimeReplFactory mRhinoReplFactory = this.mRhinoReplFactory;
        if (mRhinoReplFactory != null) {
            return mRhinoReplFactory.newInstance();
        }
        return (RuntimeRepl)new RuntimeRepl(this) {
            public final RhinoDetectingRuntimeReplFactory this$0;
            
            public Object evaluate(final String s) throws Exception {
                if (RhinoDetectingRuntimeReplFactory.access$000(this.this$0) != null) {
                    final StringBuilder t = a.t("stetho-js-rhino threw: ");
                    t.append(RhinoDetectingRuntimeReplFactory.access$000(this.this$0).toString());
                    return t.toString();
                }
                return "Not supported without stetho-js-rhino dependency";
            }
        };
    }
}
