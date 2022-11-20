// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform;

import java.util.Arrays;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import okhttp3.Protocol;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import javax.net.ssl.SSLSocket;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B7\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0012¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform;", "Lokhttp3/internal/platform/Platform;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lcg2/j;", "configureTlsExtensions", "afterHandshake", "getSelectedProtocol", "Ljava/lang/reflect/Method;", "putMethod", "Ljava/lang/reflect/Method;", "getMethod", "removeMethod", "Ljava/lang/Class;", "clientProviderClass", "Ljava/lang/Class;", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Companion", "AlpnProvider", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Jdk8WithJettyBootPlatform extends Platform
{
    public static final Jdk8WithJettyBootPlatform.Jdk8WithJettyBootPlatform$Companion Companion;
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;
    
    static {
        Companion = new Jdk8WithJettyBootPlatform.Jdk8WithJettyBootPlatform$Companion((DefaultConstructorMarker)null);
    }
    
    public Jdk8WithJettyBootPlatform(final Method putMethod, final Method getMethod, final Method removeMethod, final Class<?> clientProviderClass, final Class<?> serverProviderClass) {
        e.f((Object)putMethod, "putMethod");
        e.f((Object)getMethod, "getMethod");
        e.f((Object)removeMethod, "removeMethod");
        e.f((Object)clientProviderClass, "clientProviderClass");
        e.f((Object)serverProviderClass, "serverProviderClass");
        this.putMethod = putMethod;
        this.getMethod = getMethod;
        this.removeMethod = removeMethod;
        this.clientProviderClass = clientProviderClass;
        this.serverProviderClass = serverProviderClass;
    }
    
    public void afterHandshake(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        try {
            this.removeMethod.invoke(null, sslSocket);
        }
        catch (final InvocationTargetException ex) {
            throw new AssertionError("failed to remove ALPN", ex);
        }
        catch (final IllegalAccessException ex2) {
            throw new AssertionError("failed to remove ALPN", ex2);
        }
    }
    
    public void configureTlsExtensions(final SSLSocket sslSocket, final String s, final List<? extends Protocol> list) {
        e.f((Object)sslSocket, "sslSocket");
        e.f((Object)list, "protocols");
        final List alpnProtocolNames = Platform.Companion.alpnProtocolNames((List)list);
        try {
            this.putMethod.invoke(null, sslSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[] { this.clientProviderClass, this.serverProviderClass }, new AlpnProvider(alpnProtocolNames)));
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError("failed to set ALPN", ex);
        }
        catch (final InvocationTargetException ex2) {
            throw new AssertionError("failed to set ALPN", ex2);
        }
    }
    
    public String getSelectedProtocol(final SSLSocket sslSocket) {
        e.f((Object)sslSocket, "sslSocket");
        try {
            final Method getMethod = this.getMethod;
            final String s = null;
            final InvocationHandler invocationHandler = Proxy.getInvocationHandler(getMethod.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            final AlpnProvider alpnProvider = (AlpnProvider)invocationHandler;
            if (!alpnProvider.getUnsupported() && alpnProvider.getSelected() == null) {
                Platform.log$default((Platform)this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable)null, 6, (Object)null);
                return null;
            }
            String selected;
            if (alpnProvider.getUnsupported()) {
                selected = s;
            }
            else {
                selected = alpnProvider.getSelected();
            }
            return selected;
        }
        catch (final IllegalAccessException ex) {
            throw new AssertionError("failed to get ALPN selected protocol", ex);
        }
        catch (final InvocationTargetException ex2) {
            throw new AssertionError("failed to get ALPN selected protocol", ex2);
        }
    }
    
    @Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019" }, d2 = { "Lokhttp3/internal/platform/Jdk8WithJettyBootPlatform$AlpnProvider;", "Ljava/lang/reflect/InvocationHandler;", "protocols", "", "", "(Ljava/util/List;)V", "selected", "getSelected", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "unsupported", "", "getUnsupported", "()Z", "setUnsupported", "(Z)V", "invoke", "", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class AlpnProvider implements InvocationHandler
    {
        private final List<String> protocols;
        private String selected;
        private boolean unsupported;
        
        public AlpnProvider(final List<String> protocols) {
            e.f((Object)protocols, "protocols");
            this.protocols = protocols;
        }
        
        public final String getSelected() {
            return this.selected;
        }
        
        public final boolean getUnsupported() {
            return this.unsupported;
        }
        
        @Override
        public Object invoke(Object o, final Method method, final Object[] array) throws Throwable {
            e.f(o, "proxy");
            e.f((Object)method, "method");
            Object[] array2 = array;
            if (array == null) {
                array2 = new Object[0];
            }
            final String name = method.getName();
            final Class<?> returnType = method.getReturnType();
            if (e.a((Object)name, (Object)"supports") && e.a((Object)Boolean.TYPE, (Object)returnType)) {
                return Boolean.TRUE;
            }
            if (e.a((Object)name, (Object)"unsupported") && e.a((Object)Void.TYPE, (Object)returnType)) {
                this.unsupported = true;
                return null;
            }
            if (e.a((Object)name, (Object)"protocols") && array2.length == 0) {
                return this.protocols;
            }
            if ((e.a((Object)name, (Object)"selectProtocol") || e.a((Object)name, (Object)"select")) && e.a((Object)String.class, (Object)returnType) && array2.length == 1) {
                final Object o2 = array2[0];
                if (o2 instanceof List) {
                    if (o2 != null) {
                        final List list = (List)o2;
                        final int size = list.size();
                        if (size >= 0) {
                            int n = 0;
                            while (true) {
                                final Object value = list.get(n);
                                if (value == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                final String selected = (String)value;
                                if (this.protocols.contains(selected)) {
                                    return this.selected = selected;
                                }
                                if (n == size) {
                                    break;
                                }
                                ++n;
                            }
                        }
                        return this.selected = this.protocols.get(0);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
            }
            if ((!e.a((Object)name, (Object)"protocolSelected") && !e.a((Object)name, (Object)"selected")) || array2.length != 1) {
                return method.invoke(this, Arrays.copyOf(array2, array2.length));
            }
            o = array2[0];
            if (o != null) {
                this.selected = (String)o;
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        
        public final void setSelected(final String selected) {
            this.selected = selected;
        }
        
        public final void setUnsupported(final boolean unsupported) {
            this.unsupported = unsupported;
        }
    }
}
