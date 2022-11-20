// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.platform.AndroidPlatform;
import xi2.a;
import java.lang.reflect.InvocationTargetException;
import okhttp3.internal.platform.Platform;
import okhttp3.Protocol;
import java.util.List;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\u0010\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001c" }, d2 = { "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "", "isSupported", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "getSelectedProtocol", "Ljava/lang/Class;", "sslSocketClass", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "setAlpnProtocols", "<init>", "(Ljava/lang/Class;)V", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public class AndroidSocketAdapter implements SocketAdapter
{
    public static final AndroidSocketAdapter.AndroidSocketAdapter$Companion Companion;
    private static final DeferredSocketAdapter$Factory playProviderFactory;
    private final Method getAlpnSelectedProtocol;
    private final Method setAlpnProtocols;
    private final Method setHostname;
    private final Method setUseSessionTickets;
    private final Class<? super SSLSocket> sslSocketClass;
    
    static {
        playProviderFactory = (Companion = new AndroidSocketAdapter.AndroidSocketAdapter$Companion((DefaultConstructorMarker)null)).factory("com.google.android.gms.org.conscrypt");
    }
    
    public AndroidSocketAdapter(final Class<? super SSLSocket> sslSocketClass) {
        e.f((Object)sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        final Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        e.e((Object)declaredMethod, "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", (Class[])new Class[0]);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }
    
    public static final DeferredSocketAdapter$Factory access$getPlayProviderFactory$cp() {
        return AndroidSocketAdapter.playProviderFactory;
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        if (this.matchesSocket(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                if (s != null) {
                    this.setHostname.invoke(sslSocket, s);
                }
                this.setAlpnProtocols.invoke(sslSocket, Platform.Companion.concatLengthPrefixed((List)list));
            }
            catch (final InvocationTargetException ex) {
                throw new AssertionError((Object)ex);
            }
            catch (final IllegalAccessException ex2) {
                throw new AssertionError((Object)ex2);
            }
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        final boolean matchesSocket = this.matchesSocket(sslSocket);
        final String s = null;
        if (!matchesSocket) {
            return null;
        }
        String s2;
        try {
            final byte[] array = (byte[])this.getAlpnSelectedProtocol.invoke(sslSocket, new Object[0]);
            if (array == null) {
                s2 = s;
            }
            else {
                s2 = new String(array, a.b);
            }
        }
        catch (final InvocationTargetException ex) {
            throw new AssertionError((Object)ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new AssertionError((Object)ex2);
        }
        catch (final NullPointerException ex3) {
            if (!e.a((Object)ex3.getMessage(), (Object)"ssl == null")) {
                throw ex3;
            }
            s2 = s;
        }
        return s2;
    }
    
    public boolean isSupported() {
        return AndroidPlatform.Companion.isSupported();
    }
    
    public boolean matchesSocket(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }
    
    public boolean matchesSocketFactory(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.matchesSocketFactory((SocketAdapter)this, sslSocketFactory);
    }
    
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        return SocketAdapter$DefaultImpls.trustManager((SocketAdapter)this, sslSocketFactory);
    }
}
