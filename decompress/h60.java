// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.apollographql.apollo.api.ResponseField$d;
import com.reddit.type.RecordingStatus$a;
import j7.k;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.RecordingStatus;
import com.apollographql.apollo.api.ResponseField;

public final class h60
{
    public static final ResponseField[] g;
    public final String a;
    public final Integer b;
    public final RecordingStatus c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final ResponseField f = ResponseField$b.f((Map)null, "recordingDuration", true, "recordingDuration");
        final ResponseField d = ResponseField$b.d("recordingStatus", true, "recordingStatus");
        final CustomType url = CustomType.URL;
        g = new ResponseField[] { i, f, d, (ResponseField)ResponseField$b.b((o)url, "recordingHlsUrl", "recordingHlsUrl", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "recordingDashUrl", "recordingDashUrl", (Map)null, true), (ResponseField)ResponseField$b.b((o)url, "recordingFallbackUrl", "recordingFallbackUrl", (Map)null, true) };
    }
    
    public h60(final String a, final Integer b, final RecordingStatus c, final Object d, final Object e, final Object f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h60)) {
            return false;
        }
        final h60 h60 = (h60)o;
        return sg2.e.a((Object)this.a, (Object)h60.a) && sg2.e.a((Object)this.b, (Object)h60.b) && this.c == h60.c && sg2.e.a(this.d, h60.d) && sg2.e.a(this.e, h60.e) && sg2.e.a(this.f, h60.f);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final RecordingStatus c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Object e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Object f = this.f;
        if (f != null) {
            hashCode2 = f.hashCode();
        }
        return ((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TalkRecordingFragment(__typename=");
        r.append(this.a);
        r.append(", recordingDuration=");
        r.append(this.b);
        r.append(", recordingStatus=");
        r.append(this.c);
        r.append(", recordingHlsUrl=");
        r.append(this.d);
        r.append(", recordingDashUrl=");
        r.append(this.e);
        r.append(", recordingFallbackUrl=");
        return wu.a.b(r, this.f, ')');
    }
    
    public static final class a
    {
        public static h60 a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] g = h60.g;
            final String f = k.f(g[0]);
            e.c((Object)f);
            final Integer h = k.h(g[1]);
            final String f2 = k.f(g[2]);
            RecordingStatus a;
            if (f2 != null) {
                RecordingStatus.Companion.getClass();
                a = RecordingStatus$a.a(f2);
            }
            else {
                a = null;
            }
            final ResponseField responseField = g[3];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            final ResponseField responseField2 = g[4];
            e.d((Object)responseField2, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField2);
            final ResponseField responseField3 = g[5];
            e.d((Object)responseField3, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            return new h60(f, h, a, d, d2, k.d((ResponseField$d)responseField3));
        }
    }
}
