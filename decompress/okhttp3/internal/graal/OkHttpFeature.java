// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.graal;

import org.graalvm.nativeimage.ImageSingletons;
import com.oracle.svm.core.configure.ResourcesRegistry;
import org.graalvm.nativeimage.hosted.Feature$BeforeAnalysisAccess;
import kotlin.Metadata;
import com.oracle.svm.core.annotate.AutomaticFeature;
import org.graalvm.nativeimage.hosted.Feature;

@AutomaticFeature
@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b" }, d2 = { "Lokhttp3/internal/graal/OkHttpFeature;", "Lorg/graalvm/nativeimage/hosted/Feature;", "Lorg/graalvm/nativeimage/hosted/Feature$BeforeAnalysisAccess;", "access", "Lcg2/j;", "beforeAnalysis", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class OkHttpFeature implements Feature
{
    public void beforeAnalysis(final Feature$BeforeAnalysisAccess feature$BeforeAnalysisAccess) {
        ((ResourcesRegistry)ImageSingletons.lookup((Class)ResourcesRegistry.class)).addResources("\\Qokhttp3/internal/publicsuffix/PublicSuffixDatabase.gz\\E");
    }
}
