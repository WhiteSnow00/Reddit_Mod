// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/GenderOption;", "", "id", "", "stringRes", "", "(Ljava/lang/String;IJI)V", "getId", "()J", "getStringRes", "()I", "MALE", "FEMALE", "NON_BINARY", "USER_DEFINED", "OPT_OUT", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum GenderOption
{
    public static final Companion Companion;
    
    FEMALE(1L, 2131953737), 
    MALE(0L, 2131953738), 
    NON_BINARY(2L, 2131953739), 
    OPT_OUT(4L, 2131953740), 
    USER_DEFINED(3L, 2131953748);
    
    private final long id;
    private final int stringRes;
    
    static {
        Companion = new Companion(null);
    }
    
    private GenderOption(final long id, final int stringRes) {
        this.id = id;
        this.stringRes = stringRes;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final int getStringRes() {
        return this.stringRes;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/GenderOption$Companion;", "", "()V", "fromLong", "Lcom/reddit/domain/model/GenderOption;", "value", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final GenderOption fromLong(final long n) {
            for (final GenderOption genderOption : GenderOption.values()) {
                if (genderOption.getId() == n) {
                    return genderOption;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
