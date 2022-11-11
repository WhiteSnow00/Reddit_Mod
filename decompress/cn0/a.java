// 
// Decompiled by Procyon v0.6.0
// 

package cn0;

import com.reddit.domain.model.FlairRichTextItem;
import bg.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.ads.link.models.AppStoreData;
import com.reddit.domain.model.DiscussionType;
import com.reddit.domain.model.listing.RecommendationContext;
import com.reddit.domain.model.PostGallery;
import com.reddit.domain.model.liveaudio.LegacyAudioRoom;
import com.reddit.domain.model.liveaudio.AudioRoom;
import com.reddit.domain.model.RpanVideo;
import com.reddit.domain.model.predictions.PostPredictionsTournamentData;
import com.reddit.domain.model.PostPoll;
import java.util.Map;
import com.reddit.domain.model.RichTextResponse;
import com.reddit.domain.model.OutboundLink;
import com.reddit.ads.domain.PromoLayoutType;
import com.reddit.domain.model.SubredditDetail;
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.model.LinkMedia;
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import sg2.e;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.Link$Companion;
import com.reddit.domain.model.PostType;
import java.util.EnumSet;

public final class a
{
    public static final EnumSet<PostType> a;
    
    static {
        a = EnumSet.of(PostType.IMAGE, PostType.VIDEO);
    }
    
    public static final Link a(final Link$Companion link$Companion) {
        e.f((Object)link$Companion, "<this>");
        final Boolean false = Boolean.FALSE;
        return new Link("default", "default", 0L, null, "", "", "", "", 0, false, 0, 0.0, 0, 0L, 0L, "", "", "", "", "", null, null, null, null, "", null, null, false, (List)EmptyList.INSTANCE, null, false, false, "", false, false, "", null, null, null, null, "", "", "", false, "", "", "", false, false, false, false, false, false, false, false, false, false, false, false, "", "", false, false, false, null, 0, false, false, "", new ArrayList(), new ArrayList(), null, null, null, null, false, false, false, null, null, null, null, new ArrayList(), false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, 8, 64, -1048320, 536870911, null);
    }
    
    public static final String b(final Link link) {
        e.f((Object)link, "<this>");
        final List<FlairRichTextItem> linkFlairRichTextObject = link.getLinkFlairRichTextObject();
        int n = 0;
        if (linkFlairRichTextObject != null) {
            n = n;
            if (linkFlairRichTextObject.isEmpty() ^ true) {
                n = 1;
            }
        }
        String s;
        if (n != 0) {
            s = d.f0((List)linkFlairRichTextObject);
        }
        else if ((s = link.getLinkFlairText()) == null) {
            s = "";
        }
        return s;
    }
}
