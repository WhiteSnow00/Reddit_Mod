// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016�\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005�\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b�\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b�\u0006\u0002\u0010\n�\u0006\u000b" }, d2 = { "Lkotlinx/serialization/SerializationException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "kotlinx-serialization-core" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class SerializationException extends IllegalArgumentException
{
    public SerializationException() {
    }
    
    public SerializationException(final String s) {
        super(s);
    }
    
    public SerializationException(final String s, final Throwable t) {
        super(s, t);
    }
    
    public SerializationException(final Throwable t) {
        super(t);
    }
}
