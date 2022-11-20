// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.rx2;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f" }, d2 = { "Lkotlinx/coroutines/rx2/Mode;", "", "s", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "toString", "FIRST", "FIRST_OR_DEFAULT", "LAST", "SINGLE", "kotlinx-coroutines-rx2" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
enum Mode
{
    private static final Mode[] $VALUES;
    
    FIRST("awaitFirst"), 
    FIRST_OR_DEFAULT("awaitFirstOrDefault"), 
    LAST("awaitLast"), 
    SINGLE("awaitSingle");
    
    private final String s;
    
    private static final Mode[] $values() {
        return new Mode[] { Mode.FIRST, Mode.FIRST_OR_DEFAULT, Mode.LAST, Mode.SINGLE };
    }
    
    static {
        $VALUES = $values();
    }
    
    private Mode(final String s2) {
        this.s = s2;
    }
    
    public final String getS() {
        return this.s;
    }
    
    @Override
    public String toString() {
        return this.s;
    }
}
