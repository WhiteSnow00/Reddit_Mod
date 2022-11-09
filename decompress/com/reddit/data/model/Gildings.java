// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0018" }, d2 = { "Lcom/reddit/data/model/Gildings;", "", "silver", "", "gold", "supergold", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getGold", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSilver", "getSupergold", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/reddit/data/model/Gildings;", "equals", "", "other", "hashCode", "", "toString", "", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Gildings
{
    private final Long gold;
    private final Long silver;
    private final Long supergold;
    
    public Gildings(final Long silver, final Long gold, final Long supergold) {
        this.silver = silver;
        this.gold = gold;
        this.supergold = supergold;
    }
    
    public final Long component1() {
        return this.silver;
    }
    
    public final Long component2() {
        return this.gold;
    }
    
    public final Long component3() {
        return this.supergold;
    }
    
    public final Gildings copy(final Long n, final Long n2, final Long n3) {
        return new Gildings(n, n2, n3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Gildings)) {
            return false;
        }
        final Gildings gildings = (Gildings)o;
        return f.a((Object)this.silver, (Object)gildings.silver) && f.a((Object)this.gold, (Object)gildings.gold) && f.a((Object)this.supergold, (Object)gildings.supergold);
    }
    
    public final Long getGold() {
        return this.gold;
    }
    
    public final Long getSilver() {
        return this.silver;
    }
    
    public final Long getSupergold() {
        return this.supergold;
    }
    
    @Override
    public int hashCode() {
        final Long silver = this.silver;
        int hashCode = 0;
        int hashCode2;
        if (silver == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = silver.hashCode();
        }
        final Long gold = this.gold;
        int hashCode3;
        if (gold == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = gold.hashCode();
        }
        final Long supergold = this.supergold;
        if (supergold != null) {
            hashCode = supergold.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Gildings(silver=");
        k.append(this.silver);
        k.append(", gold=");
        k.append(this.gold);
        k.append(", supergold=");
        return a40.f.o(k, this.supergold, ')');
    }
}
