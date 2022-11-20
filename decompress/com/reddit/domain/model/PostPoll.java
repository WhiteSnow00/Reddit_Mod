// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.ArrayList;
import java.util.Iterator;
import android.os.Parcel;
import xi2.j;
import ng2.e;
import com.squareup.moshi.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import android.os.Parcelable$Creator;
import kotlin.Metadata;
import com.squareup.moshi.o;
import android.os.Parcelable;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0001MB\u0093\u0001\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010!\u001a\u00020\n¢\u0006\u0004\bK\u0010LJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rH\u00c6\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\rH\u00c6\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\nH\u00c6\u0003J\u009e\u0001\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0017\u001a\u00020\u00052\b\b\u0003\u0010\u0018\u001a\u00020\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010!\u001a\u00020\nH\u00c6\u0001¢\u0006\u0004\b\"\u0010#J\t\u0010$\u001a\u00020\bH\u00d6\u0001J\t\u0010%\u001a\u00020\rH\u00d6\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010)\u001a\u00020\rH\u00d6\u0001J\u0019\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\rH\u00d6\u0001J\b\u0010/\u001a\u00020\nH\u0002R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010:\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010;\u001a\u0004\b<\u0010\u000fR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010;\u001a\u0004\b=\u0010\u000fR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00107\u001a\u0004\b>\u00109R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b?\u00109R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001f\u0010;\u001a\u0004\b@\u0010\u000fR\u0019\u0010 \u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u00107\u001a\u0004\bA\u00109R\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010B\u001a\u0004\b!\u0010CR\u0011\u0010D\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0011\u0010F\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0013\u0010J\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006N" }, d2 = { "Lcom/reddit/domain/model/PostPoll;", "Landroid/os/Parcelable;", "", "Lcom/reddit/domain/model/PostPollOption;", "component1", "", "component2", "component3", "", "component4", "", "component5", "()Ljava/lang/Boolean;", "", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "component10", "component11", "component12", "options", "votingEndsTimestampMs", "totalVoteCount", "selectedOptionId", "isPrediction", "totalCoinsSet", "userCoinsWon", "resolvedOptionId", "predictionTournamentId", "predictionVoteUpdatesRemaining", "predictionStatus", "isSneakPeekUsed", "copy", "(Ljava/util/List;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/reddit/domain/model/PostPoll;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lcg2/j;", "writeToParcel", "isCancelled", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "J", "getVotingEndsTimestampMs", "()J", "getTotalVoteCount", "Ljava/lang/String;", "getSelectedOptionId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getTotalCoinsSet", "getUserCoinsWon", "getResolvedOptionId", "getPredictionTournamentId", "getPredictionVoteUpdatesRemaining", "getPredictionStatus", "Z", "()Z", "isExpired", "getCanVote", "canVote", "Lcom/reddit/domain/model/PollPredictionState;", "getPredictionState", "()Lcom/reddit/domain/model/PollPredictionState;", "predictionState", "<init>", "(Ljava/util/List;JJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostPoll implements Parcelable
{
    public static final String CANCELLED = "cancelled";
    public static final String CANCELLED_IN_PROGRESS = "cancel_in_progress";
    public static final Parcelable$Creator<PostPoll> CREATOR;
    public static final Companion Companion;
    private final Boolean isPrediction;
    private final transient boolean isSneakPeekUsed;
    private final List<PostPollOption> options;
    private final String predictionStatus;
    private final String predictionTournamentId;
    private final Integer predictionVoteUpdatesRemaining;
    private final String resolvedOptionId;
    private final String selectedOptionId;
    private final Integer totalCoinsSet;
    private final long totalVoteCount;
    private final Integer userCoinsWon;
    private final long votingEndsTimestampMs;
    
    static {
        Companion = new Companion(null);
        CREATOR = (Parcelable$Creator)new Creator();
    }
    
    public PostPoll(final List<PostPollOption> options, @n(name = "voting_end_timestamp") final long votingEndsTimestampMs, @n(name = "total_vote_count") final long totalVoteCount, @n(name = "user_selection") final String selectedOptionId, @n(name = "is_prediction") final Boolean isPrediction, @n(name = "total_stake_amount") final Integer totalCoinsSet, @n(name = "user_won_amount") final Integer userCoinsWon, @n(name = "resolved_option_id") final String resolvedOptionId, @n(name = "tournament_id") final String predictionTournamentId, @n(name = "vote_updates_remained") final Integer predictionVoteUpdatesRemaining, @n(name = "prediction_status") final String predictionStatus, final boolean isSneakPeekUsed) {
        e.f((Object)options, "options");
        this.options = options;
        this.votingEndsTimestampMs = votingEndsTimestampMs;
        this.totalVoteCount = totalVoteCount;
        this.selectedOptionId = selectedOptionId;
        this.isPrediction = isPrediction;
        this.totalCoinsSet = totalCoinsSet;
        this.userCoinsWon = userCoinsWon;
        this.resolvedOptionId = resolvedOptionId;
        this.predictionTournamentId = predictionTournamentId;
        this.predictionVoteUpdatesRemaining = predictionVoteUpdatesRemaining;
        this.predictionStatus = predictionStatus;
        this.isSneakPeekUsed = isSneakPeekUsed;
    }
    
    public PostPoll(final List list, final long n, final long n2, final String s, Boolean false, Integer n3, Integer n4, String s2, String s3, Integer n5, String s4, boolean b, final int n6, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n6 & 0x10) != 0x0) {
            false = Boolean.FALSE;
        }
        if ((n6 & 0x20) != 0x0) {
            n3 = null;
        }
        if ((n6 & 0x40) != 0x0) {
            n4 = null;
        }
        if ((n6 & 0x80) != 0x0) {
            s2 = null;
        }
        if ((n6 & 0x100) != 0x0) {
            s3 = null;
        }
        if ((n6 & 0x200) != 0x0) {
            n5 = null;
        }
        if ((n6 & 0x400) != 0x0) {
            s4 = null;
        }
        if ((n6 & 0x800) != 0x0) {
            b = false;
        }
        this(list, n, n2, s, false, n3, n4, s2, s3, n5, s4, b);
    }
    
    public static PostPoll copy$default(final PostPoll postPoll, List options, long votingEndsTimestampMs, long totalVoteCount, String selectedOptionId, Boolean isPrediction, Integer totalCoinsSet, Integer userCoinsWon, String resolvedOptionId, String predictionTournamentId, Integer predictionVoteUpdatesRemaining, String predictionStatus, boolean isSneakPeekUsed, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            options = postPoll.options;
        }
        if ((n & 0x2) != 0x0) {
            votingEndsTimestampMs = postPoll.votingEndsTimestampMs;
        }
        if ((n & 0x4) != 0x0) {
            totalVoteCount = postPoll.totalVoteCount;
        }
        if ((n & 0x8) != 0x0) {
            selectedOptionId = postPoll.selectedOptionId;
        }
        if ((n & 0x10) != 0x0) {
            isPrediction = postPoll.isPrediction;
        }
        if ((n & 0x20) != 0x0) {
            totalCoinsSet = postPoll.totalCoinsSet;
        }
        if ((n & 0x40) != 0x0) {
            userCoinsWon = postPoll.userCoinsWon;
        }
        if ((n & 0x80) != 0x0) {
            resolvedOptionId = postPoll.resolvedOptionId;
        }
        if ((n & 0x100) != 0x0) {
            predictionTournamentId = postPoll.predictionTournamentId;
        }
        if ((n & 0x200) != 0x0) {
            predictionVoteUpdatesRemaining = postPoll.predictionVoteUpdatesRemaining;
        }
        if ((n & 0x400) != 0x0) {
            predictionStatus = postPoll.predictionStatus;
        }
        if ((n & 0x800) != 0x0) {
            isSneakPeekUsed = postPoll.isSneakPeekUsed;
        }
        return postPoll.copy(options, votingEndsTimestampMs, totalVoteCount, selectedOptionId, isPrediction, totalCoinsSet, userCoinsWon, resolvedOptionId, predictionTournamentId, predictionVoteUpdatesRemaining, predictionStatus, isSneakPeekUsed);
    }
    
    private final boolean isCancelled() {
        final String predictionStatus = this.predictionStatus;
        boolean b = true;
        if (!j.z0(predictionStatus, "cancelled", true)) {
            b = (j.z0(this.predictionStatus, "cancel_in_progress", true) && b);
        }
        return b;
    }
    
    public final List<PostPollOption> component1() {
        return this.options;
    }
    
    public final Integer component10() {
        return this.predictionVoteUpdatesRemaining;
    }
    
    public final String component11() {
        return this.predictionStatus;
    }
    
    public final boolean component12() {
        return this.isSneakPeekUsed;
    }
    
    public final long component2() {
        return this.votingEndsTimestampMs;
    }
    
    public final long component3() {
        return this.totalVoteCount;
    }
    
    public final String component4() {
        return this.selectedOptionId;
    }
    
    public final Boolean component5() {
        return this.isPrediction;
    }
    
    public final Integer component6() {
        return this.totalCoinsSet;
    }
    
    public final Integer component7() {
        return this.userCoinsWon;
    }
    
    public final String component8() {
        return this.resolvedOptionId;
    }
    
    public final String component9() {
        return this.predictionTournamentId;
    }
    
    public final PostPoll copy(final List<PostPollOption> list, @n(name = "voting_end_timestamp") final long n, @n(name = "total_vote_count") final long n2, @n(name = "user_selection") final String s, @n(name = "is_prediction") final Boolean b, @n(name = "total_stake_amount") final Integer n3, @n(name = "user_won_amount") final Integer n4, @n(name = "resolved_option_id") final String s2, @n(name = "tournament_id") final String s3, @n(name = "vote_updates_remained") final Integer n5, @n(name = "prediction_status") final String s4, final boolean b2) {
        e.f((Object)list, "options");
        return new PostPoll(list, n, n2, s, b, n3, n4, s2, s3, n5, s4, b2);
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostPoll)) {
            return false;
        }
        final PostPoll postPoll = (PostPoll)o;
        return e.a((Object)this.options, (Object)postPoll.options) && this.votingEndsTimestampMs == postPoll.votingEndsTimestampMs && this.totalVoteCount == postPoll.totalVoteCount && e.a((Object)this.selectedOptionId, (Object)postPoll.selectedOptionId) && e.a((Object)this.isPrediction, (Object)postPoll.isPrediction) && e.a((Object)this.totalCoinsSet, (Object)postPoll.totalCoinsSet) && e.a((Object)this.userCoinsWon, (Object)postPoll.userCoinsWon) && e.a((Object)this.resolvedOptionId, (Object)postPoll.resolvedOptionId) && e.a((Object)this.predictionTournamentId, (Object)postPoll.predictionTournamentId) && e.a((Object)this.predictionVoteUpdatesRemaining, (Object)postPoll.predictionVoteUpdatesRemaining) && e.a((Object)this.predictionStatus, (Object)postPoll.predictionStatus) && this.isSneakPeekUsed == postPoll.isSneakPeekUsed;
    }
    
    public final boolean getCanVote() {
        final boolean a = e.a((Object)this.isPrediction, (Object)Boolean.TRUE);
        boolean b = true;
        if (a) {
            if (this.getPredictionState() == PollPredictionState.VOTING_OPEN && this.selectedOptionId == null) {
                return b;
            }
        }
        else if (this.selectedOptionId == null && !this.isExpired()) {
            return b;
        }
        b = false;
        return b;
    }
    
    public final List<PostPollOption> getOptions() {
        return this.options;
    }
    
    public final PollPredictionState getPredictionState() {
        PollPredictionState pollPredictionState;
        if (this.isCancelled()) {
            pollPredictionState = PollPredictionState.Cancelled;
        }
        else if (!e.a((Object)this.isPrediction, (Object)Boolean.TRUE)) {
            pollPredictionState = null;
        }
        else if (this.resolvedOptionId != null) {
            pollPredictionState = PollPredictionState.RESOLVED;
        }
        else if (this.isExpired()) {
            pollPredictionState = PollPredictionState.PENDING_RESOLUTION;
        }
        else {
            pollPredictionState = PollPredictionState.VOTING_OPEN;
        }
        return pollPredictionState;
    }
    
    public final String getPredictionStatus() {
        return this.predictionStatus;
    }
    
    public final String getPredictionTournamentId() {
        return this.predictionTournamentId;
    }
    
    public final Integer getPredictionVoteUpdatesRemaining() {
        return this.predictionVoteUpdatesRemaining;
    }
    
    public final String getResolvedOptionId() {
        return this.resolvedOptionId;
    }
    
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }
    
    public final Integer getTotalCoinsSet() {
        return this.totalCoinsSet;
    }
    
    public final long getTotalVoteCount() {
        return this.totalVoteCount;
    }
    
    public final Integer getUserCoinsWon() {
        return this.userCoinsWon;
    }
    
    public final long getVotingEndsTimestampMs() {
        return this.votingEndsTimestampMs;
    }
    
    @Override
    public int hashCode() {
        final int b = b.b(this.totalVoteCount, b.b(this.votingEndsTimestampMs, this.options.hashCode() * 31, 31), 31);
        final String selectedOptionId = this.selectedOptionId;
        int hashCode = 0;
        int hashCode2;
        if (selectedOptionId == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = selectedOptionId.hashCode();
        }
        final Boolean isPrediction = this.isPrediction;
        int hashCode3;
        if (isPrediction == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = isPrediction.hashCode();
        }
        final Integer totalCoinsSet = this.totalCoinsSet;
        int hashCode4;
        if (totalCoinsSet == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = totalCoinsSet.hashCode();
        }
        final Integer userCoinsWon = this.userCoinsWon;
        int hashCode5;
        if (userCoinsWon == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = userCoinsWon.hashCode();
        }
        final String resolvedOptionId = this.resolvedOptionId;
        int hashCode6;
        if (resolvedOptionId == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = resolvedOptionId.hashCode();
        }
        final String predictionTournamentId = this.predictionTournamentId;
        int hashCode7;
        if (predictionTournamentId == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = predictionTournamentId.hashCode();
        }
        final Integer predictionVoteUpdatesRemaining = this.predictionVoteUpdatesRemaining;
        int hashCode8;
        if (predictionVoteUpdatesRemaining == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = predictionVoteUpdatesRemaining.hashCode();
        }
        final String predictionStatus = this.predictionStatus;
        if (predictionStatus != null) {
            hashCode = predictionStatus.hashCode();
        }
        int isSneakPeekUsed;
        if ((isSneakPeekUsed = (this.isSneakPeekUsed ? 1 : 0)) != 0) {
            isSneakPeekUsed = 1;
        }
        return ((((((((b + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode) * 31 + isSneakPeekUsed;
    }
    
    public final boolean isExpired() {
        return this.votingEndsTimestampMs <= System.currentTimeMillis();
    }
    
    public final Boolean isPrediction() {
        return this.isPrediction;
    }
    
    public final boolean isSneakPeekUsed() {
        return this.isSneakPeekUsed;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("PostPoll(options=");
        t.append(this.options);
        t.append(", votingEndsTimestampMs=");
        t.append(this.votingEndsTimestampMs);
        t.append(", totalVoteCount=");
        t.append(this.totalVoteCount);
        t.append(", selectedOptionId=");
        t.append(this.selectedOptionId);
        t.append(", isPrediction=");
        t.append(this.isPrediction);
        t.append(", totalCoinsSet=");
        t.append(this.totalCoinsSet);
        t.append(", userCoinsWon=");
        t.append(this.userCoinsWon);
        t.append(", resolvedOptionId=");
        t.append(this.resolvedOptionId);
        t.append(", predictionTournamentId=");
        t.append(this.predictionTournamentId);
        t.append(", predictionVoteUpdatesRemaining=");
        t.append(this.predictionVoteUpdatesRemaining);
        t.append(", predictionStatus=");
        t.append(this.predictionStatus);
        t.append(", isSneakPeekUsed=");
        return d.n(t, this.isSneakPeekUsed, ')');
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        e.f((Object)parcel, "out");
        final Iterator r = android.support.v4.media.a.r((List)this.options, parcel);
        while (r.hasNext()) {
            ((PostPollOption)r.next()).writeToParcel(parcel, n);
        }
        parcel.writeLong(this.votingEndsTimestampMs);
        parcel.writeLong(this.totalVoteCount);
        parcel.writeString(this.selectedOptionId);
        final Boolean isPrediction = this.isPrediction;
        if (isPrediction == null) {
            parcel.writeInt(0);
        }
        else {
            aq2.a.w(parcel, 1, isPrediction);
        }
        final Integer totalCoinsSet = this.totalCoinsSet;
        if (totalCoinsSet == null) {
            parcel.writeInt(0);
        }
        else {
            ph0.a.j(parcel, 1, totalCoinsSet);
        }
        final Integer userCoinsWon = this.userCoinsWon;
        if (userCoinsWon == null) {
            parcel.writeInt(0);
        }
        else {
            ph0.a.j(parcel, 1, userCoinsWon);
        }
        parcel.writeString(this.resolvedOptionId);
        parcel.writeString(this.predictionTournamentId);
        final Integer predictionVoteUpdatesRemaining = this.predictionVoteUpdatesRemaining;
        if (predictionVoteUpdatesRemaining == null) {
            parcel.writeInt(0);
        }
        else {
            ph0.a.j(parcel, 1, predictionVoteUpdatesRemaining);
        }
        parcel.writeString(this.predictionStatus);
        parcel.writeInt((int)(this.isSneakPeekUsed ? 1 : 0));
    }
    
    @Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/model/PostPoll$Companion;", "", "()V", "CANCELLED", "", "CANCELLED_IN_PROGRESS", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class Creator implements Parcelable$Creator<PostPoll>
    {
        public final PostPoll createFromParcel(final Parcel parcel) {
            e.f((Object)parcel, "parcel");
            final int int1 = parcel.readInt();
            final ArrayList list = new ArrayList(int1);
            for (int i = 0; i != int1; i = u10.o.c((Parcelable$Creator)PostPollOption.CREATOR, parcel, list, i, 1)) {}
            final long long1 = parcel.readLong();
            final long long2 = parcel.readLong();
            final String string = parcel.readString();
            final int int2 = parcel.readInt();
            Integer value = null;
            Boolean value2;
            if (int2 == 0) {
                value2 = null;
            }
            else {
                value2 = (parcel.readInt() != 0);
            }
            Integer value3;
            if (parcel.readInt() == 0) {
                value3 = null;
            }
            else {
                value3 = parcel.readInt();
            }
            Integer value4;
            if (parcel.readInt() == 0) {
                value4 = null;
            }
            else {
                value4 = parcel.readInt();
            }
            final String string2 = parcel.readString();
            final String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                value = parcel.readInt();
            }
            return new PostPoll((List<PostPollOption>)list, long1, long2, string, value2, value3, value4, string2, string3, value, parcel.readString(), parcel.readInt() != 0);
        }
        
        public /* bridge */ Object createFromParcel(final Parcel parcel) {
            return this.createFromParcel(parcel);
        }
        
        public final PostPoll[] newArray(final int n) {
            return new PostPoll[n];
        }
        
        public /* bridge */ Object[] newArray(final int n) {
            return this.newArray(n);
        }
    }
}
