// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import java.util.List;

public class RemoteParticipant implements Participant
{
    private static final Logger logger;
    private final List<AudioTrackPublication> audioTrackPublications;
    private final List<DataTrackPublication> dataTrackPublications;
    private final Handler handler;
    private final String identity;
    private final AtomicReference<RemoteParticipant$Listener> listenerReference;
    private long nativeParticipantContext;
    private NetworkQualityLevel networkQualityLevel;
    private final List<RemoteAudioTrackPublication> remoteAudioTrackPublications;
    private final List<RemoteDataTrackPublication> remoteDataTrackPublications;
    public final RemoteParticipant$Listener remoteParticipantListenerProxy;
    private final List<RemoteVideoTrackPublication> remoteVideoTrackPublications;
    private final String sid;
    private final List<VideoTrackPublication> videoTrackPublications;
    
    static {
        logger = Logger.getLogger((Class)RemoteParticipant.class);
    }
    
    public RemoteParticipant(final String identity, final String sid, final List<RemoteAudioTrackPublication> remoteAudioTrackPublications, final List<RemoteVideoTrackPublication> remoteVideoTrackPublications, final List<RemoteDataTrackPublication> remoteDataTrackPublications, final Handler handler, final long nativeParticipantContext) {
        this.networkQualityLevel = NetworkQualityLevel.NETWORK_QUALITY_LEVEL_UNKNOWN;
        this.listenerReference = new AtomicReference<RemoteParticipant$Listener>(null);
        this.remoteParticipantListenerProxy = (RemoteParticipant$Listener)new RemoteParticipant$Listener(this) {
            public final RemoteParticipant this$0;
            
            public static void a(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackEnabled$20(remoteAudioTrackPublication, remoteParticipant);
            }
            
            public static void b(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                remoteParticipant$Listener.lambda$onDataTrackSubscriptionFailed$17(remoteDataTrackPublication, remoteParticipant, ex);
            }
            
            public static void c(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant, final RemoteVideoTrack remoteVideoTrack, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                remoteParticipant$Listener.lambda$onVideoTrackUnsubscribed$10(remoteVideoTrackPublication, remoteParticipant, remoteVideoTrack);
            }
            
            private void checkCallback(final RemoteParticipant remoteParticipant, final TrackPublication trackPublication, final String s) {
                final boolean b = true;
                Preconditions.checkState(remoteParticipant != null, "Received null remote participant in %s", (Object)s);
                Preconditions.checkState(trackPublication != null && b, "Received null track publication in %s", (Object)s);
            }
            
            public static void d(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final TrackPriority trackPriority, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackPublishPriorityChanged$11(remoteVideoTrackPublication, trackPriority, remoteParticipant);
            }
            
            public static void e(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackPublished$6(remoteVideoTrackPublication, remoteParticipant);
            }
            
            public static void f(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackUnpublished$1(remoteAudioTrackPublication, remoteParticipant);
            }
            
            public static void g(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackDisabled$21(remoteAudioTrackPublication, remoteParticipant);
            }
            
            public static void h(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackDisabled$23(remoteVideoTrackPublication, remoteParticipant);
            }
            
            public static void i(final RemoteDataTrack remoteDataTrack, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onDataTrackUnsubscribed$18(remoteDataTrackPublication, remoteParticipant, remoteDataTrack);
            }
            
            public static void j(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrack remoteVideoTrack, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackSwitchedOff$13(remoteVideoTrack, remoteParticipant);
            }
            
            public static void k(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrack remoteVideoTrack, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackSwitchedOn$12(remoteVideoTrack, remoteParticipant);
            }
            
            public static void l(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackEnabled$22(remoteVideoTrackPublication, remoteParticipant);
            }
            
            private void lambda$onAudioTrackDisabled$21(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackDisabled");
                remoteAudioTrackPublication.setEnabled(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackDisabled(remoteParticipant, remoteAudioTrackPublication);
                }
            }
            
            private void lambda$onAudioTrackEnabled$20(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackEnabled");
                remoteAudioTrackPublication.setEnabled(true);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackEnabled(remoteParticipant, remoteAudioTrackPublication);
                }
            }
            
            private void lambda$onAudioTrackPublishPriorityChanged$5(final RemoteAudioTrackPublication remoteAudioTrackPublication, final TrackPriority publishPriority, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackPublishPriorityChanged");
                remoteAudioTrackPublication.setPublishPriority(publishPriority);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackPublishPriorityChanged(remoteParticipant, remoteAudioTrackPublication, publishPriority);
                }
            }
            
            private void lambda$onAudioTrackPublished$0(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackPublished");
                RemoteParticipant.a(this.this$0).add(remoteAudioTrackPublication);
                RemoteParticipant.e(this.this$0).add(remoteAudioTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackPublished(remoteParticipant, remoteAudioTrackPublication);
                }
            }
            
            private void lambda$onAudioTrackSubscribed$2(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteAudioTrack remoteAudioTrack, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackSubscribed");
                remoteAudioTrackPublication.setSubscribed(true);
                remoteAudioTrackPublication.setRemoteAudioTrack(remoteAudioTrack);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackSubscribed(remoteParticipant, remoteAudioTrackPublication, remoteAudioTrack);
                }
            }
            
            private void lambda$onAudioTrackSubscriptionFailed$3(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackSubscriptionFailed");
                remoteAudioTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackSubscriptionFailed(remoteParticipant, remoteAudioTrackPublication, ex);
                }
            }
            
            private void lambda$onAudioTrackUnpublished$1(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackUnpublished");
                RemoteParticipant.a(this.this$0).remove(remoteAudioTrackPublication);
                RemoteParticipant.e(this.this$0).remove(remoteAudioTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackUnpublished(remoteParticipant, remoteAudioTrackPublication);
                }
            }
            
            private void lambda$onAudioTrackUnsubscribed$4(final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant, final RemoteAudioTrack remoteAudioTrack) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onAudioTrackUnsubscribed");
                remoteAudioTrackPublication.setRemoteAudioTrack((RemoteAudioTrack)null);
                remoteAudioTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onAudioTrackUnsubscribed(remoteParticipant, remoteAudioTrackPublication, remoteAudioTrack);
                }
            }
            
            private void lambda$onDataTrackPublishPriorityChanged$19(final RemoteDataTrackPublication remoteDataTrackPublication, final TrackPriority publishPriority, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackPublishPriorityChanged");
                remoteDataTrackPublication.setPublishPriority(publishPriority);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackPublishPriorityChanged(remoteParticipant, remoteDataTrackPublication, publishPriority);
                }
            }
            
            private void lambda$onDataTrackPublished$14(final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackPublished");
                RemoteParticipant.b(this.this$0).add(remoteDataTrackPublication);
                RemoteParticipant.f(this.this$0).add(remoteDataTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackPublished(remoteParticipant, remoteDataTrackPublication);
                }
            }
            
            private void lambda$onDataTrackSubscribed$16(final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteDataTrack remoteDataTrack, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackSubscribed");
                remoteDataTrackPublication.setSubscribed(true);
                remoteDataTrackPublication.setRemoteDataTrack(remoteDataTrack);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackSubscribed(remoteParticipant, remoteDataTrackPublication, remoteDataTrack);
                }
            }
            
            private void lambda$onDataTrackSubscriptionFailed$17(final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackSubscriptionFailed");
                remoteDataTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackSubscriptionFailed(remoteParticipant, remoteDataTrackPublication, ex);
                }
            }
            
            private void lambda$onDataTrackUnpublished$15(final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackUnpublished");
                RemoteParticipant.b(this.this$0).remove(remoteDataTrackPublication);
                RemoteParticipant.f(this.this$0).remove(remoteDataTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackUnpublished(remoteParticipant, remoteDataTrackPublication);
                }
            }
            
            private void lambda$onDataTrackUnsubscribed$18(final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant, final RemoteDataTrack remoteDataTrack) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onDataTrackUnsubscribed");
                remoteDataTrackPublication.setRemoteDataTrack((RemoteDataTrack)null);
                remoteDataTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onDataTrackUnsubscribed(remoteParticipant, remoteDataTrackPublication, remoteDataTrack);
                }
            }
            
            private void lambda$onNetworkQualityLevelChanged$24(final RemoteParticipant remoteParticipant, final NetworkQualityLevel networkQualityLevel) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onNetworkQualityLevelChanged");
                RemoteParticipant.i(remoteParticipant, networkQualityLevel);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onNetworkQualityLevelChanged(remoteParticipant, networkQualityLevel);
                }
            }
            
            private void lambda$onVideoTrackDisabled$23(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackDisabled");
                remoteVideoTrackPublication.setEnabled(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackDisabled(remoteParticipant, remoteVideoTrackPublication);
                }
            }
            
            private void lambda$onVideoTrackEnabled$22(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackEnabled");
                remoteVideoTrackPublication.setEnabled(true);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackEnabled(remoteParticipant, remoteVideoTrackPublication);
                }
            }
            
            private void lambda$onVideoTrackPublishPriorityChanged$11(final RemoteVideoTrackPublication remoteVideoTrackPublication, final TrackPriority publishPriority, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackPublishPriorityChanged");
                remoteVideoTrackPublication.setPublishPriority(publishPriority);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackPublishPriorityChanged(remoteParticipant, remoteVideoTrackPublication, publishPriority);
                }
            }
            
            private void lambda$onVideoTrackPublished$6(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackPublished");
                RemoteParticipant.h(this.this$0).add(remoteVideoTrackPublication);
                RemoteParticipant.g(this.this$0).add(remoteVideoTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackPublished(remoteParticipant, remoteVideoTrackPublication);
                }
            }
            
            private void lambda$onVideoTrackSubscribed$8(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteVideoTrack remoteVideoTrack, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackSubscribed");
                remoteVideoTrackPublication.setSubscribed(true);
                remoteVideoTrackPublication.setRemoteVideoTrack(remoteVideoTrack);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackSubscribed(remoteParticipant, remoteVideoTrackPublication, remoteVideoTrack);
                    remoteVideoTrack.checkSinkAttachments();
                }
            }
            
            private void lambda$onVideoTrackSubscriptionFailed$9(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackSubscriptionFailed");
                remoteVideoTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackSubscriptionFailed(remoteParticipant, remoteVideoTrackPublication, ex);
                }
            }
            
            private void lambda$onVideoTrackSwitchedOff$13(final RemoteVideoTrack remoteVideoTrack, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackSwitchedOff");
                remoteVideoTrack.setSwitchedOff(true);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackSwitchedOff(remoteParticipant, remoteVideoTrack);
                }
            }
            
            private void lambda$onVideoTrackSwitchedOn$12(final RemoteVideoTrack remoteVideoTrack, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackSwitchedOn");
                remoteVideoTrack.setSwitchedOff(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackSwitchedOn(remoteParticipant, remoteVideoTrack);
                }
            }
            
            private void lambda$onVideoTrackUnpublished$7(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackUnpublished");
                RemoteParticipant.h(this.this$0).remove(remoteVideoTrackPublication);
                RemoteParticipant.g(this.this$0).remove(remoteVideoTrackPublication);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackUnpublished(remoteParticipant, remoteVideoTrackPublication);
                }
            }
            
            private void lambda$onVideoTrackUnsubscribed$10(final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant, final RemoteVideoTrack remoteVideoTrack) {
                ThreadChecker.checkIsValidThread(RemoteParticipant.c(this.this$0));
                RemoteParticipant.j().d("onVideoTrackUnsubscribed");
                remoteVideoTrackPublication.setRemoteVideoTrack((RemoteVideoTrack)null);
                remoteVideoTrackPublication.setSubscribed(false);
                final RemoteParticipant$Listener remoteParticipant$Listener = RemoteParticipant.d(this.this$0).get();
                if (remoteParticipant$Listener != null) {
                    remoteParticipant$Listener.onVideoTrackUnsubscribed(remoteParticipant, remoteVideoTrackPublication, remoteVideoTrack);
                }
            }
            
            public static void m(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                remoteParticipant$Listener.lambda$onVideoTrackSubscriptionFailed$9(remoteVideoTrackPublication, remoteParticipant, ex);
            }
            
            public static void n(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onDataTrackUnpublished$15(remoteDataTrackPublication, remoteParticipant);
            }
            
            public static void o(final RemoteAudioTrack remoteAudioTrack, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackUnsubscribed$4(remoteAudioTrackPublication, remoteParticipant, remoteAudioTrack);
            }
            
            public static void p(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant, final RemoteVideoTrack remoteVideoTrack, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                remoteParticipant$Listener.lambda$onVideoTrackSubscribed$8(remoteVideoTrackPublication, remoteVideoTrack, remoteParticipant);
            }
            
            public static void q(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onDataTrackPublished$14(remoteDataTrackPublication, remoteParticipant);
            }
            
            public static void r(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant, final NetworkQualityLevel networkQualityLevel) {
                remoteParticipant$Listener.lambda$onNetworkQualityLevelChanged$24(remoteParticipant, networkQualityLevel);
            }
            
            public static void s(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onVideoTrackUnpublished$7(remoteVideoTrackPublication, remoteParticipant);
            }
            
            public static void t(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackPublished$0(remoteAudioTrackPublication, remoteParticipant);
            }
            
            public static void u(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final TrackPriority trackPriority, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackPublishPriorityChanged$5(remoteAudioTrackPublication, trackPriority, remoteParticipant);
            }
            
            public static void v(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant remoteParticipant, final TwilioException ex) {
                remoteParticipant$Listener.lambda$onAudioTrackSubscriptionFailed$3(remoteAudioTrackPublication, remoteParticipant, ex);
            }
            
            public static void w(final RemoteParticipant$1 remoteParticipant$Listener, final RemoteDataTrackPublication remoteDataTrackPublication, final TrackPriority trackPriority, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onDataTrackPublishPriorityChanged$19(remoteDataTrackPublication, trackPriority, remoteParticipant);
            }
            
            public static void x(final RemoteAudioTrack remoteAudioTrack, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onAudioTrackSubscribed$2(remoteAudioTrackPublication, remoteAudioTrack, remoteParticipant);
            }
            
            public static void y(final RemoteDataTrack remoteDataTrack, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteParticipant$1 remoteParticipant$Listener, final RemoteParticipant remoteParticipant) {
                remoteParticipant$Listener.lambda$onDataTrackSubscribed$16(remoteDataTrackPublication, remoteDataTrack, remoteParticipant);
            }
            
            public void onAudioTrackDisabled(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackDisabled");
                RemoteParticipant.c(this.this$0).post((Runnable)new j((Object)this, 1, (Object)remoteAudioTrackPublication, (Object)remoteParticipant));
            }
            
            public void onAudioTrackEnabled(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackEnabled");
                RemoteParticipant.c(this.this$0).post((Runnable)new f((Object)this, 1, (Object)remoteAudioTrackPublication, (Object)remoteParticipant));
            }
            
            public void onAudioTrackPublishPriorityChanged(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication, final TrackPriority trackPriority) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackPublishPriorityChanged");
                RemoteParticipant.c(this.this$0).post((Runnable)new i((Object)this, (Object)remoteAudioTrackPublication, (Object)trackPriority, (Object)remoteParticipant, 3));
            }
            
            public void onAudioTrackPublished(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackPublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new k((Object)this, 3, (Object)remoteAudioTrackPublication, (Object)remoteParticipant));
            }
            
            public void onAudioTrackSubscribed(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteAudioTrack remoteAudioTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackSubscribed");
                RemoteParticipant.c(this.this$0).post((Runnable)new m(this, (TrackPublication)remoteAudioTrackPublication, (Track)remoteAudioTrack, remoteParticipant, 1));
            }
            
            public void onAudioTrackSubscriptionFailed(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication, final TwilioException ex) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackSubscriptionFailed");
                RemoteParticipant.c(this.this$0).post((Runnable)new h((Object)this, (Object)remoteAudioTrackPublication, (Object)remoteParticipant, (Object)ex, 1));
            }
            
            public void onAudioTrackUnpublished(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackUnpublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new g((Object)this, 3, (Object)remoteAudioTrackPublication, (Object)remoteParticipant));
            }
            
            public void onAudioTrackUnsubscribed(final RemoteParticipant remoteParticipant, final RemoteAudioTrackPublication remoteAudioTrackPublication, final RemoteAudioTrack remoteAudioTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteAudioTrackPublication, "onAudioTrackUnsubscribed");
                remoteAudioTrack.release();
                RemoteParticipant.c(this.this$0).post((Runnable)new h((Object)this, (Object)remoteAudioTrackPublication, (Object)remoteParticipant, (Object)remoteAudioTrack, 2));
            }
            
            public void onDataTrackPublishPriorityChanged(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication, final TrackPriority trackPriority) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackPublishPriorityChanged");
                RemoteParticipant.c(this.this$0).post((Runnable)new p(this, (TrackPublication)remoteDataTrackPublication, trackPriority, remoteParticipant, 0));
            }
            
            public void onDataTrackPublished(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackPublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new o(this, remoteDataTrackPublication, remoteParticipant, 1));
            }
            
            public void onDataTrackSubscribed(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteDataTrack remoteDataTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackSubscribed");
                RemoteParticipant.c(this.this$0).post((Runnable)new m(this, (TrackPublication)remoteDataTrackPublication, (Track)remoteDataTrack, remoteParticipant, 0));
            }
            
            public void onDataTrackSubscriptionFailed(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication, final TwilioException ex) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackSubscriptionFailed");
                RemoteParticipant.c(this.this$0).post((Runnable)new m(this, remoteDataTrackPublication, remoteParticipant, ex));
            }
            
            public void onDataTrackUnpublished(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackUnpublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new o(this, remoteDataTrackPublication, remoteParticipant, 0));
            }
            
            public void onDataTrackUnsubscribed(final RemoteParticipant remoteParticipant, final RemoteDataTrackPublication remoteDataTrackPublication, final RemoteDataTrack remoteDataTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteDataTrackPublication, "onDataTrackUnsubscribed");
                remoteDataTrack.release();
                RemoteParticipant.c(this.this$0).post((Runnable)new i((Object)this, (Object)remoteDataTrackPublication, (Object)remoteParticipant, (Object)remoteDataTrack, 1));
            }
            
            public void onNetworkQualityLevelChanged(final RemoteParticipant remoteParticipant, final NetworkQualityLevel networkQualityLevel) {
                RemoteParticipant.c(this.this$0).post((Runnable)new g((Object)this, 2, (Object)remoteParticipant, (Object)networkQualityLevel));
            }
            
            public void onVideoTrackDisabled(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackDisabled");
                RemoteParticipant.c(this.this$0).post((Runnable)new n(this, remoteVideoTrackPublication, remoteParticipant, 0));
            }
            
            public void onVideoTrackEnabled(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackEnabled");
                RemoteParticipant.c(this.this$0).post((Runnable)new k((Object)this, 2, (Object)remoteVideoTrackPublication, (Object)remoteParticipant));
            }
            
            public void onVideoTrackPublishPriorityChanged(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication, final TrackPriority trackPriority) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackPublishPriorityChanged");
                RemoteParticipant.c(this.this$0).post((Runnable)new p(this, (TrackPublication)remoteVideoTrackPublication, trackPriority, remoteParticipant, 1));
            }
            
            public void onVideoTrackPublished(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackPublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new e((Object)this, 2, (Object)remoteVideoTrackPublication, (Object)remoteParticipant));
            }
            
            public void onVideoTrackSubscribed(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteVideoTrack remoteVideoTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackSubscribed");
                RemoteParticipant.c(this.this$0).post((Runnable)new l((Object)this, (Object)remoteVideoTrackPublication, (Track)remoteVideoTrack, (Object)remoteParticipant, 0));
            }
            
            public void onVideoTrackSubscriptionFailed(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication, final TwilioException ex) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackSubscriptionFailed");
                RemoteParticipant.c(this.this$0).post((Runnable)new i((Object)this, (Object)remoteVideoTrackPublication, (Object)remoteParticipant, (Object)ex, 2));
            }
            
            public void onVideoTrackSwitchedOff(final RemoteParticipant remoteParticipant, final RemoteVideoTrack remoteVideoTrack) {
                final boolean b = false;
                Preconditions.checkState(remoteParticipant != null, (Object)"Received null remote participant in onVideoTrackSwitchedOff");
                boolean b2 = b;
                if (remoteVideoTrack != null) {
                    b2 = true;
                }
                Preconditions.checkState(b2, (Object)"Received null remote video track in onVideoTrackSwitchedOff");
                RemoteParticipant.c(this.this$0).post((Runnable)new k((Object)this, 1, (Object)remoteVideoTrack, (Object)remoteParticipant));
            }
            
            public void onVideoTrackSwitchedOn(final RemoteParticipant remoteParticipant, final RemoteVideoTrack remoteVideoTrack) {
                final boolean b = false;
                Preconditions.checkState(remoteParticipant != null, (Object)"Received null remote participant in onVideoTrackSwitchedOn");
                boolean b2 = b;
                if (remoteVideoTrack != null) {
                    b2 = true;
                }
                Preconditions.checkState(b2, (Object)"Received null remote video track in onVideoTrackSwitchedOn");
                RemoteParticipant.c(this.this$0).post((Runnable)new e((Object)this, 1, (Object)remoteVideoTrack, (Object)remoteParticipant));
            }
            
            public void onVideoTrackUnpublished(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackUnpublished");
                RemoteParticipant.c(this.this$0).post((Runnable)new n(this, remoteVideoTrackPublication, remoteParticipant, 1));
            }
            
            public void onVideoTrackUnsubscribed(final RemoteParticipant remoteParticipant, final RemoteVideoTrackPublication remoteVideoTrackPublication, final RemoteVideoTrack remoteVideoTrack) {
                this.checkCallback(remoteParticipant, (TrackPublication)remoteVideoTrackPublication, "onVideoTrackUnsubscribed");
                remoteVideoTrack.release();
                RemoteParticipant.c(this.this$0).post((Runnable)new l(this, remoteParticipant, remoteVideoTrack, remoteVideoTrackPublication));
            }
        };
        this.identity = identity;
        this.sid = sid;
        this.remoteAudioTrackPublications = remoteAudioTrackPublications;
        this.audioTrackPublications = new ArrayList<AudioTrackPublication>(remoteAudioTrackPublications.size());
        this.addAudioTracks(remoteAudioTrackPublications);
        this.remoteVideoTrackPublications = remoteVideoTrackPublications;
        this.videoTrackPublications = new ArrayList<VideoTrackPublication>(remoteVideoTrackPublications.size());
        this.addVideoTracks(remoteVideoTrackPublications);
        this.remoteDataTrackPublications = remoteDataTrackPublications;
        this.dataTrackPublications = new ArrayList<DataTrackPublication>(remoteDataTrackPublications.size());
        this.addDataTracks(remoteDataTrackPublications);
        this.handler = handler;
        this.nativeParticipantContext = nativeParticipantContext;
    }
    
    public static /* bridge */ List a(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.audioTrackPublications;
    }
    
    private void addAudioTracks(final List<RemoteAudioTrackPublication> list) {
        this.audioTrackPublications.addAll((Collection<? extends AudioTrackPublication>)list);
    }
    
    private void addDataTracks(final List<RemoteDataTrackPublication> list) {
        this.dataTrackPublications.addAll((Collection<? extends DataTrackPublication>)list);
    }
    
    private void addVideoTracks(final List<RemoteVideoTrackPublication> list) {
        this.videoTrackPublications.addAll((Collection<? extends VideoTrackPublication>)list);
    }
    
    public static /* bridge */ List b(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.dataTrackPublications;
    }
    
    public static /* bridge */ Handler c(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.handler;
    }
    
    public static /* bridge */ AtomicReference d(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.listenerReference;
    }
    
    public static /* bridge */ List e(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.remoteAudioTrackPublications;
    }
    
    public static /* bridge */ List f(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.remoteDataTrackPublications;
    }
    
    public static /* bridge */ List g(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.remoteVideoTrackPublications;
    }
    
    public static /* bridge */ List h(final RemoteParticipant remoteParticipant) {
        return remoteParticipant.videoTrackPublications;
    }
    
    public static /* bridge */ void i(final RemoteParticipant remoteParticipant, final NetworkQualityLevel networkQualityLevel) {
        remoteParticipant.networkQualityLevel = networkQualityLevel;
    }
    
    public static /* bridge */ Logger j() {
        return RemoteParticipant.logger;
    }
    
    private native Participant$State nativeGetState(final long p0);
    
    private native void nativeRelease(final long p0);
    
    public List<AudioTrackPublication> getAudioTracks() {
        return Collections.unmodifiableList((List<? extends AudioTrackPublication>)this.audioTrackPublications);
    }
    
    public List<DataTrackPublication> getDataTracks() {
        return Collections.unmodifiableList((List<? extends DataTrackPublication>)this.dataTrackPublications);
    }
    
    public String getIdentity() {
        return this.identity;
    }
    
    public NetworkQualityLevel getNetworkQualityLevel() {
        return this.networkQualityLevel;
    }
    
    public List<RemoteAudioTrackPublication> getRemoteAudioTracks() {
        return Collections.unmodifiableList((List<? extends RemoteAudioTrackPublication>)this.remoteAudioTrackPublications);
    }
    
    public List<RemoteDataTrackPublication> getRemoteDataTracks() {
        return Collections.unmodifiableList((List<? extends RemoteDataTrackPublication>)this.remoteDataTrackPublications);
    }
    
    public List<RemoteVideoTrackPublication> getRemoteVideoTracks() {
        return Collections.unmodifiableList((List<? extends RemoteVideoTrackPublication>)this.remoteVideoTrackPublications);
    }
    
    public String getSid() {
        return this.sid;
    }
    
    public Participant$State getState() {
        synchronized (this) {
            if (this.isReleased()) {
                return Participant$State.DISCONNECTED;
            }
            return this.nativeGetState(this.nativeParticipantContext);
        }
    }
    
    public List<VideoTrackPublication> getVideoTracks() {
        return Collections.unmodifiableList((List<? extends VideoTrackPublication>)this.videoTrackPublications);
    }
    
    public boolean isReleased() {
        return this.nativeParticipantContext == 0L;
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                final Iterator<RemoteAudioTrackPublication> iterator = this.remoteAudioTrackPublications.iterator();
                while (iterator.hasNext()) {
                    final RemoteAudioTrack remoteAudioTrack = iterator.next().getRemoteAudioTrack();
                    if (remoteAudioTrack != null) {
                        remoteAudioTrack.release();
                    }
                }
                final Iterator<RemoteVideoTrackPublication> iterator2 = this.remoteVideoTrackPublications.iterator();
                while (iterator2.hasNext()) {
                    final RemoteVideoTrack remoteVideoTrack = iterator2.next().getRemoteVideoTrack();
                    if (remoteVideoTrack != null) {
                        remoteVideoTrack.release();
                    }
                }
                this.nativeRelease(this.nativeParticipantContext);
                this.nativeParticipantContext = 0L;
            }
        }
    }
    
    public void setListener(final RemoteParticipant$Listener remoteParticipant$Listener) {
        Preconditions.checkNotNull((Object)remoteParticipant$Listener, (Object)"Listener must not be null");
        this.listenerReference.set(remoteParticipant$Listener);
    }
}
