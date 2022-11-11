// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0012\b\u0001\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0012\b\u0003\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\b2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u00c6\u0001¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/awards/model/AwardResponse;", "", "", "awardSucceeded", "", "userCoinBalance", "", "awardKarmaReceived", "", "Lcom/reddit/domain/awards/model/Award;", "awardings", "", "errors", "treatmentTags", "copy", "<init>", "(ZIJLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class AwardResponse
{
    public final boolean a;
    public final int b;
    public final long c;
    public final List<Award> d;
    public final List<String> e;
    public final List<String> f;
    
    public AwardResponse(@n(name = "ok") final boolean a, @n(name = "coins") final int b, @n(name = "awardKarmaReceived") final long c, @n(name = "awardings") final List<Award> d, @n(name = "json") final List<String> e, @n(name = "treatment_tags") final List<String> f) {
        sg2.e.f((Object)f, "treatmentTags");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public AwardResponse(final boolean b, final int n, final long n2, final List list, final List list2, List instance, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x20) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        this(b, n, n2, list, list2, (List<String>)instance);
    }
    
    public final AwardResponse copy(@n(name = "ok") final boolean b, @n(name = "coins") final int n, @n(name = "awardKarmaReceived") final long n2, @n(name = "awardings") final List<Award> list, @n(name = "json") final List<String> list2, @n(name = "treatment_tags") final List<String> list3) {
        sg2.e.f((Object)list3, "treatmentTags");
        return new AwardResponse(b, n, n2, list, list2, list3);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwardResponse)) {
            return false;
        }
        final AwardResponse awardResponse = (AwardResponse)o;
        return this.a == awardResponse.a && this.b == awardResponse.b && this.c == awardResponse.c && sg2.e.a((Object)this.d, (Object)awardResponse.d) && sg2.e.a((Object)this.e, (Object)awardResponse.e) && sg2.e.a((Object)this.f, (Object)awardResponse.f);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        final int b = b.b(this.c, a.c(this.b, a * 31, 31), 31);
        final List<Award> d = this.d;
        int hashCode = 0;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        final List<String> e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return this.f.hashCode() + ((b + hashCode2) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AwardResponse(awardSucceeded=");
        r.append(this.a);
        r.append(", userCoinBalance=");
        r.append(this.b);
        r.append(", awardKarmaReceived=");
        r.append(this.c);
        r.append(", awardings=");
        r.append(this.d);
        r.append(", errors=");
        r.append(this.e);
        r.append(", treatmentTags=");
        return d.o(r, (List)this.f, ')');
    }
}
