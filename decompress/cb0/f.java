// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import com.reddit.domain.model.listing.RecommendationContext;
import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import com.reddit.ads.link.models.AppStoreData;
import com.reddit.domain.model.DiscussionType;
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
import com.reddit.mod.notes.domain.model.NoteLabel;
import com.reddit.domain.modtools.ModQueueTriggers;
import com.reddit.domain.model.mod.BannedBy;
import com.reddit.domain.model.LinkMedia;
import com.reddit.domain.model.Preview;
import com.reddit.domain.awardsleaderboard.AwardLeaderboardStatus;
import java.util.List;
import com.reddit.domain.model.SubredditDetail;
import com.reddit.domain.model.Link;

public final class f implements m
{
    public final /* synthetic */ int a;
    
    @Override
    public final Link a(final Link link, final Link link2) {
        switch (this.a) {
            default: {
                ah2.f.f((Object)link, "originalLink");
                ah2.f.f((Object)link2, "linkToBeUpdated");
                final SubredditDetail subredditDetail = link.getSubredditDetail();
                SubredditDetail subredditDetail2 = link2.getSubredditDetail();
                if (subredditDetail2 == null) {
                    subredditDetail2 = subredditDetail;
                }
                SubredditDetail copy$default;
                if (subredditDetail2 != null) {
                    final SubredditDetail subredditDetail3 = link2.getSubredditDetail();
                    String subredditTitle2 = null;
                    Label_0293: {
                        if (subredditDetail3 != null) {
                            String subredditTitle = subredditDetail3.getSubredditTitle();
                            if (subredditTitle != null) {
                                if (subredditTitle.length() <= 0) {
                                    subredditTitle = null;
                                }
                                subredditTitle2 = subredditTitle;
                                if (subredditTitle != null) {
                                    break Label_0293;
                                }
                            }
                        }
                        if (subredditDetail != null) {
                            subredditTitle2 = subredditDetail.getSubredditTitle();
                        }
                        else {
                            subredditTitle2 = "";
                        }
                    }
                    final SubredditDetail subredditDetail4 = link2.getSubredditDetail();
                    Boolean b;
                    if (subredditDetail4 == null || (b = subredditDetail4.isTitleSafe()) == null) {
                        if (subredditDetail != null) {
                            b = subredditDetail.isTitleSafe();
                        }
                        else {
                            b = null;
                        }
                    }
                    copy$default = SubredditDetail.copy$default(subredditDetail2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, subredditTitle2, b, 65535, null);
                }
                else {
                    copy$default = null;
                }
                return Link.copy$default(link2, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, false, false, link.getSubscribed(), false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, copy$default, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, link.getRecommendationContext(), null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -262145, -134218241, 134217727, null);
            }
            case 0: {
                ah2.f.f((Object)link, "originalLink");
                ah2.f.f((Object)link2, "linkToBeUpdated");
                return Link.copy$default(link2, null, null, 0L, null, null, null, null, 0, null, 0, 0.0, 0, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, null, null, null, null, null, null, null, null, false, null, null, null, false, false, link.getQuarantine(), false, false, false, false, false, false, false, false, false, null, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, -1, -65537, -1, 134217727, null);
            }
        }
    }
}
