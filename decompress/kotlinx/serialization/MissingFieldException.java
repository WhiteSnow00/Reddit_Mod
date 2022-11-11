// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization;

import lw0.b;
import sg2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\bB\u000f\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\tB'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "missingFields", "", "", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "message", "cause", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMissingFields", "()Ljava/util/List;", "kotlinx-serialization-core" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MissingFieldException extends SerializationException
{
    private final List<String> missingFields;
    
    public MissingFieldException(final String s) {
        e.f((Object)s, "missingField");
        this(b.r1((Object)s), a.k("Field '", s, "' is required, but it was missing"), null);
    }
    
    public MissingFieldException(final String s, final String s2) {
        e.f((Object)s, "missingField");
        e.f((Object)s2, "serialName");
        this(b.r1((Object)s), al0.a.k("Field '", s, "' is required for type with serial name '", s2, "', but it was missing"), null);
    }
    
    public MissingFieldException(final List<String> list, String s) {
        e.f((Object)list, "missingFields");
        e.f((Object)s, "serialName");
        if (list.size() == 1) {
            s = b.j(a.r("Field '"), (String)list.get(0), "' is required for type with serial name '", s, "', but it was missing");
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(list);
            sb.append(" are required for type with serial name '");
            sb.append(s);
            sb.append("', but they were missing");
            s = sb.toString();
        }
        this(list, s, null);
    }
    
    public MissingFieldException(final List<String> missingFields, final String s, final Throwable t) {
        e.f((Object)missingFields, "missingFields");
        super(s, t);
        this.missingFields = missingFields;
    }
    
    public final List<String> getMissingFields() {
        return this.missingFields;
    }
}
