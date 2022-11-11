// 
// Decompiled by Procyon v0.6.0
// 

package al0;

import com.apollographql.apollo.api.ResponseField$d;
import j7.k;
import sg2.e;
import h7.o;
import com.reddit.type.CustomType;
import java.util.Map;
import com.apollographql.apollo.api.ResponseField$b;
import com.reddit.type.PredictionTournamentStatus;
import com.apollographql.apollo.api.ResponseField;

public final class xv
{
    public static final ResponseField[] f;
    public final String a;
    public final String b;
    public final String c;
    public final PredictionTournamentStatus d;
    public final String e;
    
    static {
        final ResponseField i = ResponseField$b.i((Map)null, "__typename", false, "__typename");
        final CustomType id = CustomType.ID;
        f = new ResponseField[] { i, (ResponseField)ResponseField$b.b((o)id, "tournamentId", "tournamentId", (Map)null, false), ResponseField$b.i((Map)null, "name", true, "name"), ResponseField$b.d("status", true, "status"), (ResponseField)ResponseField$b.b((o)id, "themeId", "themeId", (Map)null, false) };
    }
    
    public xv(final String a, final String b, final String c, final PredictionTournamentStatus d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xv)) {
            return false;
        }
        final xv xv = (xv)o;
        return sg2.e.a((Object)this.a, (Object)xv.a) && sg2.e.a((Object)this.b, (Object)xv.b) && sg2.e.a((Object)this.c, (Object)xv.c) && this.d == xv.d && sg2.e.a((Object)this.e, (Object)xv.e);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, this.a.hashCode() * 31, 31);
        final String c2 = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c2 == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c2.hashCode();
        }
        final PredictionTournamentStatus d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return this.e.hashCode() + ((c + hashCode2) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PredictionTournamentFragment(__typename=");
        r.append(this.a);
        r.append(", tournamentId=");
        r.append(this.b);
        r.append(", name=");
        r.append(this.c);
        r.append(", status=");
        r.append(this.d);
        r.append(", themeId=");
        return f0.n(r, this.e, ')');
    }
    
    public static final class a
    {
        public static xv a(final k k) {
            e.f((Object)k, "reader");
            final ResponseField[] f = xv.f;
            int n = 0;
            final String f2 = k.f(f[0]);
            e.c((Object)f2);
            final ResponseField responseField = f[1];
            e.d((Object)responseField, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d = k.d((ResponseField$d)responseField);
            e.c(d);
            final String s = (String)d;
            final String f3 = k.f(f[2]);
            final String f4 = k.f(f[3]);
            PredictionTournamentStatus predictionTournamentStatus = null;
            final PredictionTournamentStatus predictionTournamentStatus2 = null;
            PredictionTournamentStatus unknown__ = null;
            Label_0165: {
                if (f4 != null) {
                    PredictionTournamentStatus.Companion.getClass();
                    final PredictionTournamentStatus[] values = PredictionTournamentStatus.values();
                    final int length = values.length;
                    PredictionTournamentStatus predictionTournamentStatus3;
                    while (true) {
                        predictionTournamentStatus3 = predictionTournamentStatus2;
                        if (n >= length) {
                            break;
                        }
                        predictionTournamentStatus3 = values[n];
                        if (e.a((Object)predictionTournamentStatus3.getRawValue(), (Object)f4)) {
                            break;
                        }
                        ++n;
                    }
                    if ((predictionTournamentStatus = predictionTournamentStatus3) == null) {
                        unknown__ = PredictionTournamentStatus.UNKNOWN__;
                        break Label_0165;
                    }
                }
                unknown__ = predictionTournamentStatus;
            }
            final ResponseField responseField2 = xv.f[4];
            e.d((Object)responseField2, "null cannot be cast to non-null type com.apollographql.apollo.api.ResponseField.CustomTypeField");
            final Object d2 = k.d((ResponseField$d)responseField2);
            e.c(d2);
            return new xv(f2, s, f3, unknown__, (String)d2);
        }
    }
}
