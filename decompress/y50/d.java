// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import com.reddit.type.CommunityProgressCardStatus;
import com.reddit.type.BadgeStyle;
import com.reddit.fragment.CommunityProgressButtonFragment$d;
import com.reddit.fragment.CommunityProgressButtonFragment$a;
import com.reddit.fragment.CommunityProgressButtonFragment$b;
import com.reddit.fragment.CommunityProgressButtonFragment$c;
import com.reddit.domain.model.tagging.NewCommunityProgressButton$NewCommunityProgressCreatePostButton;
import com.reddit.domain.model.mod.RepeatMode;
import com.reddit.domain.model.tagging.NewCommunityProgressButton$NewCommunityProgressShareButton;
import com.reddit.domain.model.tagging.NewCommunityProgressButton$NewCommunityProgressUrlButton;
import com.reddit.domain.model.tagging.NewCommunityProgressButton;
import com.reddit.fragment.CommunityProgressButtonFragment;

public final class d
{
    public static NewCommunityProgressButton a(final CommunityProgressButtonFragment communityProgressButtonFragment) {
        final CommunityProgressButtonFragment$c b = communityProgressButtonFragment.b;
        Object o;
        if (b != null) {
            o = new NewCommunityProgressButton$NewCommunityProgressUrlButton(b.b, b.c.toString());
        }
        else {
            final CommunityProgressButtonFragment$b c = communityProgressButtonFragment.c;
            if (c != null) {
                o = new NewCommunityProgressButton$NewCommunityProgressShareButton(c.b);
            }
            else {
                final CommunityProgressButtonFragment$a d = communityProgressButtonFragment.d;
                final RepeatMode repeatMode = null;
                if (d != null) {
                    final String b2 = d.b;
                    final String c2 = d.c;
                    String s = "";
                    String s2;
                    if ((s2 = c2) == null) {
                        s2 = "";
                    }
                    final CommunityProgressButtonFragment$d d2 = d.d;
                    String b3;
                    if (d2 != null) {
                        b3 = d2.b;
                    }
                    else {
                        b3 = null;
                    }
                    if (b3 != null) {
                        s = b3;
                    }
                    final RepeatMode weekly = RepeatMode.WEEKLY;
                    final boolean b4 = d.e != null;
                    RepeatMode repeatMode2 = repeatMode;
                    if (b4) {
                        repeatMode2 = weekly;
                    }
                    RepeatMode do_NOT_REPEAT;
                    if ((do_NOT_REPEAT = repeatMode2) == null) {
                        do_NOT_REPEAT = RepeatMode.DO_NOT_REPEAT;
                    }
                    o = new NewCommunityProgressButton$NewCommunityProgressCreatePostButton(b2, s2, s, do_NOT_REPEAT);
                }
                else {
                    o = null;
                }
            }
        }
        return (NewCommunityProgressButton)o;
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        
        static {
            final int[] a2 = new int[BadgeStyle.values().length];
            a2[((Enum)BadgeStyle.NUMBERED).ordinal()] = 1;
            a2[((Enum)BadgeStyle.FILLED).ordinal()] = 2;
            a2[((Enum)BadgeStyle.UNKNOWN__).ordinal()] = 3;
            a = a2;
            final int[] b2 = new int[CommunityProgressCardStatus.values().length];
            b2[((Enum)CommunityProgressCardStatus.INITIAL).ordinal()] = 1;
            b2[((Enum)CommunityProgressCardStatus.ACTIONED).ordinal()] = 2;
            b2[((Enum)CommunityProgressCardStatus.COMPLETED).ordinal()] = 3;
            b = b2;
        }
    }
}
