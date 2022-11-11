// 
// Decompiled by Procyon v0.6.0
// 

package ac0;

import com.reddit.domain.model.LinkMedia;
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
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import java.util.List;
import gf0.a$a;
import com.reddit.domain.model.vote.VoteDirection;
import com.reddit.domain.model.Link;
import sg2.e;
import va0.f0;
import ua0.m;

public final class a implements m
{
    public final lf0.a a;
    public final gf0.a b;
    
    public a(final lf0.a a, final gf0.a b, final f0 f0) {
        e.f((Object)a, "voteRepository");
        e.f((Object)b, "getVoteScoreUseCase");
        e.f((Object)f0, "videoFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final Link a(final Link link, final Link link2) {
        e.f((Object)link, "originalLink");
        e.f((Object)link2, "linkToBeUpdated");
        final boolean video = link.isVideo();
        final Preview preview = link.getPreview();
        final LinkMedia media = link.getMedia();
        final Integer b = this.a.b(link.getKindWithId());
        Integer n;
        if (b != null) {
            final a$a a$a = new a$a(link, VoteDirection.Companion.fromInt(b.intValue()));
            this.b.getClass();
            n = gf0.a.a(a$a);
        }
        else {
            n = link.getScore();
        }
        int n2;
        if (n != null) {
            n2 = n;
        }
        else {
            n2 = link2.getScore();
        }
        return Link.copy$default(link2, null, null, 0L, null, null, null, null, null, n2, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, preview, null, media, null, null, null, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, video, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, -257, -161, -9, 536870911, null);
    }
}
