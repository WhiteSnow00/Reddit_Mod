// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.cache;

import fk2.c;
import ng2.e;
import fk2.e0;
import cg2.j;
import java.io.IOException;
import mg2.l;
import kotlin.Metadata;
import fk2.k;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017" }, d2 = { "Lokhttp3/internal/cache/FaultHidingSink;", "Lfk2/k;", "Lfk2/c;", "source", "", "byteCount", "Lcg2/j;", "write", "flush", "close", "", "hasErrors", "Z", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lmg2/l;", "getOnException", "()Lmg2/l;", "Lfk2/e0;", "delegate", "<init>", "(Lfk2/e0;Lmg2/l;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public class FaultHidingSink extends k
{
    private boolean hasErrors;
    private final l<IOException, j> onException;
    
    public FaultHidingSink(final e0 e0, final l<? super IOException, j> onException) {
        e.f((Object)e0, "delegate");
        e.f((Object)onException, "onException");
        super(e0);
        this.onException = (l<IOException, j>)onException;
    }
    
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        }
        catch (final IOException ex) {
            this.hasErrors = true;
            this.onException.invoke((Object)ex);
        }
    }
    
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        }
        catch (final IOException ex) {
            this.hasErrors = true;
            this.onException.invoke((Object)ex);
        }
    }
    
    public final l<IOException, j> getOnException() {
        return this.onException;
    }
    
    public void write(final c c, final long n) {
        e.f((Object)c, "source");
        if (this.hasErrors) {
            c.skip(n);
            return;
        }
        try {
            super.write(c, n);
        }
        catch (final IOException ex) {
            this.hasErrors = true;
            this.onException.invoke((Object)ex);
        }
    }
}
