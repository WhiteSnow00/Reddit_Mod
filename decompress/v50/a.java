// 
// Decompiled by Procyon v0.6.0
// 

package v50;

import com.reddit.type.Currency;
import com.reddit.type.SkuCoinsReceiver;
import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import kotlin.time.DurationUnit;

public final class a
{
    public static final Long a(final Long n) {
        n.longValue();
        final int i = a.i;
        return a.g(xd.a.C1((long)n, DurationUnit.MILLISECONDS));
    }
    
    public static final com.reddit.gold.model.DurationUnit b(final com.reddit.type.DurationUnit durationUnit) {
        e.f((Object)durationUnit, "<this>");
        com.reddit.gold.model.DurationUnit durationUnit2 = null;
        switch (a.a[((Enum)durationUnit).ordinal()]) {
            default: {
                throw new NoWhenBranchMatchedException();
            }
            case 7: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.UNKNOWN;
                break;
            }
            case 6: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.YEAR;
                break;
            }
            case 5: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.MONTH;
                break;
            }
            case 4: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.DAY;
                break;
            }
            case 3: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.HOUR;
                break;
            }
            case 2: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.MINUTE;
                break;
            }
            case 1: {
                durationUnit2 = com.reddit.gold.model.DurationUnit.SECOND;
                break;
            }
        }
        return durationUnit2;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        
        static {
            final int[] a2 = new int[com.reddit.type.DurationUnit.values().length];
            a2[((Enum)com.reddit.type.DurationUnit.SECOND).ordinal()] = 1;
            a2[((Enum)com.reddit.type.DurationUnit.MINUTE).ordinal()] = 2;
            a2[((Enum)com.reddit.type.DurationUnit.HOUR).ordinal()] = 3;
            a2[((Enum)com.reddit.type.DurationUnit.DAY).ordinal()] = 4;
            a2[((Enum)com.reddit.type.DurationUnit.MONTH).ordinal()] = 5;
            a2[((Enum)com.reddit.type.DurationUnit.YEAR).ordinal()] = 6;
            a2[((Enum)com.reddit.type.DurationUnit.UNKNOWN__).ordinal()] = 7;
            a = a2;
            final int[] b2 = new int[SkuCoinsReceiver.values().length];
            b2[((Enum)SkuCoinsReceiver.BUYER).ordinal()] = 1;
            b2[((Enum)SkuCoinsReceiver.SUBREDDIT).ordinal()] = 2;
            b2[((Enum)SkuCoinsReceiver.USERINSUBREDDIT).ordinal()] = 3;
            b2[((Enum)SkuCoinsReceiver.RECEIVER).ordinal()] = 4;
            b2[((Enum)SkuCoinsReceiver.UNKNOWN__).ordinal()] = 5;
            b = b2;
            final int[] c2 = new int[Currency.values().length];
            c2[((Enum)Currency.USD).ordinal()] = 1;
            c2[((Enum)Currency.ETHEREUM).ordinal()] = 2;
            c2[((Enum)Currency.COINS).ordinal()] = 3;
            c2[((Enum)Currency.SUBREDDIT_POINTS).ordinal()] = 4;
            c2[((Enum)Currency.UNKNOWN__).ordinal()] = 5;
            c = c2;
        }
    }
}
