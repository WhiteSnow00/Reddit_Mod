// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import com.reddit.type.CommunityProgressCardStatus;
import com.reddit.type.BadgeStyle;
import com.reddit.fragment.CommunityProgressButtonFragment$d;
import com.reddit.fragment.CommunityProgressButtonFragment$a;
import com.reddit.fragment.CommunityProgressButtonFragment$b;
import com.reddit.fragment.CommunityProgressButtonFragment$c;
import com.reddit.domain.model.mod.RepeatMode;
import com.reddit.domain.model.tagging.NewCommunityProgressButton;
import com.reddit.fragment.CommunityProgressButtonFragment;

public final class d
{
    public static NewCommunityProgressButton a(final CommunityProgressButtonFragment communityProgressButtonFragment) {
        final CommunityProgressButtonFragment$c b = communityProgressButtonFragment.b;
        NewCommunityProgressButton newCommunityProgressButton;
        if (b != null) {
            newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressUrlButton(b.b, b.c.toString());
        }
        else {
            final CommunityProgressButtonFragment$b c = communityProgressButtonFragment.c;
            if (c != null) {
                newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressShareButton(c.b);
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
                    newCommunityProgressButton = new NewCommunityProgressButton.NewCommunityProgressCreatePostButton(b2, s2, s, do_NOT_REPEAT);
                }
                else {
                    newCommunityProgressButton = null;
                }
            }
        }
        return newCommunityProgressButton;
    }
}
