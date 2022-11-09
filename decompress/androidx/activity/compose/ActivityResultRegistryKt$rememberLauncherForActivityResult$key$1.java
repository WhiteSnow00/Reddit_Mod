// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity.compose;

import java.util.UUID;
import kotlin.Metadata;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
final class ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 extends Lambda implements a<String>
{
    public static final ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1 INSTANCE;
    
    static {
        INSTANCE = new ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1();
    }
    
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1() {
        super(0);
    }
    
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
