// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.awards.model;

import kj2.j;
import java.util.Locale;
import sa0.c;
import ah2.f;
import com.squareup.moshi.n;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/awards/model/AwardType;", "", "", "toString", "apiType", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "MODERATOR", "COMMUNITY", "GLOBAL", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public enum AwardType
{
    private static final String AWARD_TYPE_COMMUNITY = "community";
    private static final String AWARD_TYPE_GLOBAL = "global";
    private static final String AWARD_TYPE_MOD = "moderator";
    private static final String AWARD_TYPE_UNKNOWN = "gid_unknown";
    
    @n(name = "community")
    COMMUNITY("community");
    
    public static final a Companion;
    
    @n(name = "global")
    GLOBAL("global"), 
    @n(name = "moderator")
    MODERATOR("moderator");
    
    private static final String MOD_AWARDS_TYPE = "gid_mod";
    private static final String PURCHASE_TYPE_PREFIX = "gid_";
    private final String apiType;
    
    static {
        Companion = new a();
    }
    
    private AwardType(final String apiType) {
        this.apiType = apiType;
    }
    
    @Override
    public String toString() {
        return this.apiType;
    }
    
    public static final class a
    {
        public static String a(final AwardType awardType, final AwardSubType awardSubType, String string) {
            f.f((Object)string, "awardId");
            if (awardSubType != null) {
                AwardSubType a;
                if (awardType != null) {
                    a = c.a(awardType);
                }
                else {
                    a = null;
                }
                if (a != awardSubType) {
                    final StringBuilder k = a.k("gid_");
                    final String string2 = awardSubType.toString();
                    final Locale us = Locale.US;
                    f.e((Object)us, "US");
                    final String lowerCase = string2.toLowerCase(us);
                    f.e((Object)lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    k.append(lowerCase);
                    return k.toString();
                }
            }
            if (awardType == AwardType.MODERATOR) {
                string = "gid_mod";
            }
            else if (awardType != AwardType.GLOBAL || !j.e2(string, "gid_", false)) {
                if (awardType != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("gid_");
                    sb.append(awardType);
                    string = sb.toString();
                }
                else {
                    string = "gid_unknown";
                }
            }
            return string;
        }
    }
}
