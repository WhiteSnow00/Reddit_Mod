// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.webkit.ValueCallback;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;

public final class 0ct
{
    public static final a LIZ;
    
    static {
        Covode.recordClassIndex(5764);
        LIZ = (a)new b((byte)0);
    }
    
    public static void LIZ(final WebView webView, final String s) {
        0ct.LIZ.LIZ(webView, s);
    }
    
    public static class a
    {
        static {
            Covode.recordClassIndex(5765);
        }
        
        public void LIZ(final WebView webView, final String s) {
            MethodCollector.i(9206);
            if (webView == null) {
                MethodCollector.o(9206);
                return;
            }
            try {
                webView.loadUrl(s);
                MethodCollector.o(9206);
            }
            finally {
                MethodCollector.o(9206);
            }
        }
    }
    
    public static final class b extends a
    {
        static {
            Covode.recordClassIndex(5766);
        }
        
        public b() {
            super((byte)0);
        }
        
        @Override
        public final void LIZ(final WebView webView, final String s) {
            MethodCollector.i(8598);
            if (webView == null) {
                MethodCollector.o(8598);
                return;
            }
            while (true) {
                if (s != null && s.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(s, (ValueCallback)null);
                        break Label_0054;
                    }
                    finally {
                        final Throwable t;
                        final boolean b = t instanceof IllegalStateException;
                    }
                }
                try {
                    webView.loadUrl(s);
                    MethodCollector.o(8598);
                    return;
                    MethodCollector.o(8598);
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
}
