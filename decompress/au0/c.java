// 
// Decompiled by Procyon v0.6.0
// 

package au0;

import kotlin.NoWhenBranchMatchedException;
import sg2.e;
import kotlin.Pair;
import com.reddit.domain.model.vote.VoteDirection;

public final class c
{
    public static Pair a(final VoteDirection voteDirection) {
        e.f((Object)null, "name");
        e.f((Object)null, "modelId");
        e.f((Object)voteDirection, "voteDirection");
        e.f((Object)null, "name");
        throw null;
    }
    
    public static Pair b(final VoteDirection voteDirection, final VoteDirection voteDirection2) {
        e.f((Object)voteDirection, "previousState");
        e.f((Object)voteDirection2, "voteDirection");
        final int[] a = c.a.a;
        final int n = a[voteDirection2.ordinal()];
        final Integer value = -1;
        final Integer value2 = 1;
        Pair pair;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                final int n2 = a[voteDirection.ordinal()];
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair((Object)VoteDirection.NONE, (Object)0);
                    }
                    else {
                        pair = new Pair((Object)VoteDirection.NONE, (Object)value2);
                    }
                }
                else {
                    pair = new Pair((Object)VoteDirection.NONE, (Object)value);
                }
            }
            else {
                final int n3 = a[voteDirection.ordinal()];
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pair = new Pair((Object)VoteDirection.DOWN, (Object)value);
                    }
                    else {
                        pair = new Pair((Object)VoteDirection.NONE, (Object)value2);
                    }
                }
                else {
                    pair = new Pair((Object)VoteDirection.DOWN, (Object)(-2));
                }
            }
        }
        else {
            final int n4 = a[voteDirection.ordinal()];
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair((Object)VoteDirection.UP, (Object)value2);
                }
                else {
                    pair = new Pair((Object)VoteDirection.UP, (Object)2);
                }
            }
            else {
                pair = new Pair((Object)VoteDirection.NONE, (Object)value);
            }
        }
        return new Pair(pair.getFirst(), pair.getSecond());
    }
}
