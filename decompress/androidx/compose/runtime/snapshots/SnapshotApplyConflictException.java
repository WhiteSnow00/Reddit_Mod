// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.snapshots;

import sg2.e;
import i1.f;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Li1/f;", "snapshot", "Li1/f;", "getSnapshot", "()Li1/f;", "<init>", "(Li1/f;)V", "runtime_release" }, k = 1, mv = { 1, 6, 0 })
public final class SnapshotApplyConflictException extends Exception
{
    public static final int $stable = 8;
    private final f snapshot;
    
    public SnapshotApplyConflictException(final f snapshot) {
        e.f((Object)snapshot, "snapshot");
        this.snapshot = snapshot;
    }
    
    public final f getSnapshot() {
        return this.snapshot;
    }
}
