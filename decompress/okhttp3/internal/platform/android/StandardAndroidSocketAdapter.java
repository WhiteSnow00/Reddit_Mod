// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.platform.android;

import okhttp3.internal._UtilJvmKt;
import javax.net.ssl.X509TrustManager;
import ng2.e;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f" }, d2 = { "Lokhttp3/internal/platform/android/StandardAndroidSocketAdapter;", "Lokhttp3/internal/platform/android/AndroidSocketAdapter;", "sslSocketClass", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketFactoryClass", "Ljavax/net/ssl/SSLSocketFactory;", "paramClass", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "matchesSocketFactory", "", "sslSocketFactory", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "Companion", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter
{
    public static final StandardAndroidSocketAdapter.StandardAndroidSocketAdapter$Companion Companion;
    private final Class<?> paramClass;
    private final Class<? super SSLSocketFactory> sslSocketFactoryClass;
    
    static {
        Companion = new StandardAndroidSocketAdapter.StandardAndroidSocketAdapter$Companion((DefaultConstructorMarker)null);
    }
    
    public StandardAndroidSocketAdapter(final Class<? super SSLSocket> clazz, final Class<? super SSLSocketFactory> sslSocketFactoryClass, final Class<?> paramClass) {
        e.f((Object)clazz, "sslSocketClass");
        e.f((Object)sslSocketFactoryClass, "sslSocketFactoryClass");
        e.f((Object)paramClass, "paramClass");
        super(clazz);
        this.sslSocketFactoryClass = sslSocketFactoryClass;
        this.paramClass = paramClass;
    }
    
    @Override
    public boolean matchesSocketFactory(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        return this.sslSocketFactoryClass.isInstance(sslSocketFactory);
    }
    
    @Override
    public X509TrustManager trustManager(final SSLSocketFactory sslSocketFactory) {
        e.f((Object)sslSocketFactory, "sslSocketFactory");
        final Object fieldOrNull = _UtilJvmKt.readFieldOrNull(sslSocketFactory, this.paramClass, "sslParameters");
        e.c(fieldOrNull);
        X509TrustManager x509TrustManager;
        if ((x509TrustManager = _UtilJvmKt.readFieldOrNull(fieldOrNull, X509TrustManager.class, "x509TrustManager")) == null) {
            x509TrustManager = _UtilJvmKt.readFieldOrNull(fieldOrNull, X509TrustManager.class, "trustManager");
        }
        return x509TrustManager;
    }
}
