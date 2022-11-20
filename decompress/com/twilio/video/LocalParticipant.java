// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import java.util.List;

public class LocalParticipant implements Participant
{
    private static final Logger logger;
    private final List<AudioTrackPublication> audioTrackPublications;
    private final List<DataTrackPublication> dataTrackPublications;
    private final Handler handler;
    private final String identity;
    private final AtomicReference<LocalParticipant$Listener> listenerReference;
    private final List<LocalAudioTrackPublication> localAudioTrackPublications;
    private final List<LocalDataTrackPublication> localDataTrackPublications;
    public final LocalParticipant$Listener localParticipantListenerProxy;
    private final List<LocalVideoTrackPublication> localVideoTrackPublications;
    private long nativeLocalParticipantHandle;
    private NetworkQualityLevel networkQualityLevel;
    private final String sid;
    private final String signalingRegion;
    private final List<VideoTrackPublication> videoTrackPublications;
    
    static {
        logger = Logger.getLogger((Class)LocalParticipant.class);
    }
    
    public LocalParticipant(final long nativeLocalParticipantHandle, final String sid, final String identity, final String signalingRegion, final List<LocalAudioTrackPublication> localAudioTrackPublications, final List<LocalVideoTrackPublication> localVideoTrackPublications, final List<LocalDataTrackPublication> localDataTrackPublications, final Handler handler) {
        this.networkQualityLevel = NetworkQualityLevel.NETWORK_QUALITY_LEVEL_UNKNOWN;
        this.listenerReference = new AtomicReference<LocalParticipant$Listener>(null);
        this.localParticipantListenerProxy = (LocalParticipant$Listener)new LocalParticipant$Listener(this) {
            public final LocalParticipant this$0;
            
            public static void a(final LocalParticipant$1 localParticipant$Listener, final LocalParticipant localParticipant, final NetworkQualityLevel networkQualityLevel) {
                localParticipant$Listener.lambda$onNetworkQualityLevelChanged$6(localParticipant, networkQualityLevel);
            }
            
            public static void b(final LocalParticipant$1 localParticipant$Listener, final LocalAudioTrackPublication localAudioTrackPublication, final LocalParticipant localParticipant) {
                localParticipant$Listener.lambda$onAudioTrackPublished$0(localAudioTrackPublication, localParticipant);
            }
            
            public static void c(final LocalParticipant$1 localParticipant$Listener, final LocalDataTrackPublication localDataTrackPublication, final LocalParticipant localParticipant) {
                localParticipant$Listener.lambda$onDataTrackPublished$4(localDataTrackPublication, localParticipant);
            }
            
            private void checkPublicationFailedCallback(final LocalParticipant localParticipant, final Track track, final TwilioException ex, final String s) {
                final boolean b = true;
                Preconditions.checkState(localParticipant != null, "Received null local participant in %s", (Object)s);
                Preconditions.checkState(track != null, "Received null track in %s", (Object)s);
                Preconditions.checkState(ex != null && b, "Received null exception in %s", (Object)s);
            }
            
            private void checkPublishedCallback(final LocalParticipant localParticipant, final TrackPublication trackPublication, final String s) {
                final boolean b = true;
                Preconditions.checkState(localParticipant != null, "Received null local participant in %s", (Object)s);
                Preconditions.checkState(trackPublication != null && b, "Received null track publication in %s", (Object)s);
            }
            
            public static void d(final LocalParticipant$1 localParticipant$Listener, final LocalParticipant localParticipant, final LocalAudioTrack localAudioTrack, final TwilioException ex) {
                localParticipant$Listener.lambda$onAudioTrackPublicationFailed$1(localParticipant, localAudioTrack, ex);
            }
            
            public static void e(final LocalParticipant$1 localParticipant$Listener, final LocalParticipant localParticipant, final LocalVideoTrack localVideoTrack, final TwilioException ex) {
                localParticipant$Listener.lambda$onVideoTrackPublicationFailed$3(localParticipant, localVideoTrack, ex);
            }
            
            public static void f(final LocalParticipant$1 localParticipant$Listener, final LocalParticipant localParticipant, final LocalDataTrack localDataTrack, final TwilioException ex) {
                localParticipant$Listener.lambda$onDataTrackPublicationFailed$5(localParticipant, localDataTrack, ex);
            }
            
            public static void g(final LocalParticipant$1 localParticipant$Listener, final LocalVideoTrackPublication localVideoTrackPublication, final LocalParticipant localParticipant) {
                localParticipant$Listener.lambda$onVideoTrackPublished$2(localVideoTrackPublication, localParticipant);
            }
            
            private void lambda$onAudioTrackPublicationFailed$1(final LocalParticipant localParticipant, final LocalAudioTrack localAudioTrack, final TwilioException ex) {
                LocalParticipant.j().d("onAudioTrackPublicationFailed");
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onAudioTrackPublicationFailed(localParticipant, localAudioTrack, ex);
                }
            }
            
            private void lambda$onAudioTrackPublished$0(final LocalAudioTrackPublication localAudioTrackPublication, final LocalParticipant localParticipant) {
                LocalParticipant.j().d("onAudioTrackPublished");
                LocalParticipant.a(this.this$0).add(localAudioTrackPublication);
                LocalParticipant.e(this.this$0).add(localAudioTrackPublication);
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onAudioTrackPublished(localParticipant, localAudioTrackPublication);
                }
            }
            
            private void lambda$onDataTrackPublicationFailed$5(final LocalParticipant localParticipant, final LocalDataTrack localDataTrack, final TwilioException ex) {
                LocalParticipant.j().d("onDataTrackPublicationFailed");
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onDataTrackPublicationFailed(localParticipant, localDataTrack, ex);
                }
            }
            
            private void lambda$onDataTrackPublished$4(final LocalDataTrackPublication localDataTrackPublication, final LocalParticipant localParticipant) {
                LocalParticipant.j().d("onDataTrackPublished");
                LocalParticipant.b(this.this$0).add(localDataTrackPublication);
                LocalParticipant.f(this.this$0).add(localDataTrackPublication);
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onDataTrackPublished(localParticipant, localDataTrackPublication);
                }
            }
            
            private void lambda$onNetworkQualityLevelChanged$6(final LocalParticipant localParticipant, final NetworkQualityLevel networkQualityLevel) {
                LocalParticipant.j().d("onNetworkQualityLevelChanged");
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                LocalParticipant.i(localParticipant, networkQualityLevel);
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onNetworkQualityLevelChanged(localParticipant, networkQualityLevel);
                }
            }
            
            private void lambda$onVideoTrackPublicationFailed$3(final LocalParticipant localParticipant, final LocalVideoTrack localVideoTrack, final TwilioException ex) {
                LocalParticipant.j().d("onVideoTrackPublicationFailed");
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onVideoTrackPublicationFailed(localParticipant, localVideoTrack, ex);
                }
            }
            
            private void lambda$onVideoTrackPublished$2(final LocalVideoTrackPublication localVideoTrackPublication, final LocalParticipant localParticipant) {
                LocalParticipant.j().d("onAudioTrackPublished");
                LocalParticipant.h(this.this$0).add(localVideoTrackPublication);
                LocalParticipant.g(this.this$0).add(localVideoTrackPublication);
                final LocalParticipant$Listener localParticipant$Listener = LocalParticipant.d(this.this$0).get();
                if (localParticipant$Listener != null) {
                    localParticipant$Listener.onVideoTrackPublished(localParticipant, localVideoTrackPublication);
                }
            }
            
            public void onAudioTrackPublicationFailed(final LocalParticipant localParticipant, final LocalAudioTrack localAudioTrack, final TwilioException ex) {
                this.checkPublicationFailedCallback(localParticipant, (Track)localAudioTrack, ex, "onAudioTrackPublicationFailed");
                LocalParticipant.c(this.this$0).post((Runnable)new i((Object)this, (Object)localParticipant, (Object)localAudioTrack, (Object)ex, 0));
            }
            
            public void onAudioTrackPublished(final LocalParticipant localParticipant, final LocalAudioTrackPublication localAudioTrackPublication) {
                this.checkPublishedCallback(localParticipant, (TrackPublication)localAudioTrackPublication, "onAudioTrackPublished");
                LocalParticipant.c(this.this$0).post((Runnable)new f((Object)this, 0, (Object)localAudioTrackPublication, (Object)localParticipant));
            }
            
            public void onDataTrackPublicationFailed(final LocalParticipant localParticipant, final LocalDataTrack localDataTrack, final TwilioException ex) {
                this.checkPublicationFailedCallback(localParticipant, (Track)localDataTrack, ex, "onDataTrackPublicationFailed");
                LocalParticipant.c(this.this$0).post((Runnable)new l((Object)this, (Object)localParticipant, (Track)localDataTrack, (Object)ex, 2));
            }
            
            public void onDataTrackPublished(final LocalParticipant localParticipant, final LocalDataTrackPublication localDataTrackPublication) {
                this.checkPublishedCallback(localParticipant, (TrackPublication)localDataTrackPublication, "onDataTrackPublished");
                LocalParticipant.c(this.this$0).post((Runnable)new g((Object)this, 0, (Object)localDataTrackPublication, (Object)localParticipant));
            }
            
            public void onNetworkQualityLevelChanged(final LocalParticipant localParticipant, final NetworkQualityLevel networkQualityLevel) {
                LocalParticipant.c(this.this$0).post((Runnable)new j((Object)this, 0, (Object)localParticipant, (Object)networkQualityLevel));
            }
            
            public void onVideoTrackPublicationFailed(final LocalParticipant localParticipant, final LocalVideoTrack localVideoTrack, final TwilioException ex) {
                this.checkPublicationFailedCallback(localParticipant, (Track)localVideoTrack, ex, "onVideoTrackPublicationFailed");
                LocalParticipant.c(this.this$0).post((Runnable)new h((Object)this, (Object)localParticipant, (Object)localVideoTrack, (Object)ex, 0));
            }
            
            public void onVideoTrackPublished(final LocalParticipant localParticipant, final LocalVideoTrackPublication localVideoTrackPublication) {
                this.checkPublishedCallback(localParticipant, (TrackPublication)localVideoTrackPublication, "onVideoTrackPublished");
                LocalParticipant.c(this.this$0).post((Runnable)new e((Object)this, 0, (Object)localVideoTrackPublication, (Object)localParticipant));
            }
        };
        Preconditions.checkNotNull((Object)sid, (Object)"SID must not be null");
        Preconditions.checkArgument(sid.isEmpty() ^ true, (Object)"SID must not be empty");
        Preconditions.checkNotNull((Object)identity, (Object)"Identity must not be null");
        Preconditions.checkNotNull((Object)signalingRegion, (Object)"Signaling region must not be null");
        this.nativeLocalParticipantHandle = nativeLocalParticipantHandle;
        this.sid = sid;
        this.identity = identity;
        this.signalingRegion = signalingRegion;
        this.localAudioTrackPublications = localAudioTrackPublications;
        this.audioTrackPublications = new ArrayList<AudioTrackPublication>(localAudioTrackPublications.size());
        this.addAudioTracks(localAudioTrackPublications);
        this.localVideoTrackPublications = localVideoTrackPublications;
        this.videoTrackPublications = new ArrayList<VideoTrackPublication>(localVideoTrackPublications.size());
        this.addVideoTracks(localVideoTrackPublications);
        this.localDataTrackPublications = localDataTrackPublications;
        this.dataTrackPublications = new ArrayList<DataTrackPublication>(localDataTrackPublications.size());
        this.addDataTracks(localDataTrackPublications);
        this.handler = handler;
    }
    
    public static /* bridge */ List a(final LocalParticipant localParticipant) {
        return localParticipant.audioTrackPublications;
    }
    
    private void addAudioTracks(final List<LocalAudioTrackPublication> list) {
        this.audioTrackPublications.addAll((Collection<? extends AudioTrackPublication>)list);
    }
    
    private void addDataTracks(final List<LocalDataTrackPublication> list) {
        this.dataTrackPublications.addAll((Collection<? extends DataTrackPublication>)list);
    }
    
    private void addVideoTracks(final List<LocalVideoTrackPublication> list) {
        this.videoTrackPublications.addAll((Collection<? extends VideoTrackPublication>)list);
    }
    
    public static /* bridge */ List b(final LocalParticipant localParticipant) {
        return localParticipant.dataTrackPublications;
    }
    
    public static /* bridge */ Handler c(final LocalParticipant localParticipant) {
        return localParticipant.handler;
    }
    
    public static /* bridge */ AtomicReference d(final LocalParticipant localParticipant) {
        return localParticipant.listenerReference;
    }
    
    public static /* bridge */ List e(final LocalParticipant localParticipant) {
        return localParticipant.localAudioTrackPublications;
    }
    
    public static /* bridge */ List f(final LocalParticipant localParticipant) {
        return localParticipant.localDataTrackPublications;
    }
    
    public static /* bridge */ List g(final LocalParticipant localParticipant) {
        return localParticipant.localVideoTrackPublications;
    }
    
    public static /* bridge */ List h(final LocalParticipant localParticipant) {
        return localParticipant.videoTrackPublications;
    }
    
    public static /* bridge */ void i(final LocalParticipant localParticipant, final NetworkQualityLevel networkQualityLevel) {
        localParticipant.networkQualityLevel = networkQualityLevel;
    }
    
    public static /* bridge */ Logger j() {
        return LocalParticipant.logger;
    }
    
    private native Participant$State nativeGetState(final long p0);
    
    private native boolean nativePublishAudioTrack(final long p0, final LocalAudioTrack p1, final LocalTrackPublicationOptions p2, final long p3);
    
    private native boolean nativePublishDataTrack(final long p0, final LocalDataTrack p1, final LocalTrackPublicationOptions p2, final long p3);
    
    private native boolean nativePublishVideoTrack(final long p0, final LocalVideoTrack p1, final LocalTrackPublicationOptions p2, final long p3);
    
    private native void nativeRelease(final long p0);
    
    private native void nativeSetEncodingParameters(final long p0, final EncodingParameters p1);
    
    private native boolean nativeUnpublishAudioTrack(final long p0, final long p1);
    
    private native boolean nativeUnpublishDataTrack(final long p0, final long p1);
    
    private native boolean nativeUnpublishVideoTrack(final long p0, final long p1);
    
    private void removePublishedAudioTrack(final LocalAudioTrack localAudioTrack) {
        for (final LocalAudioTrackPublication localAudioTrackPublication : this.localAudioTrackPublications) {
            if (localAudioTrack.equals(localAudioTrackPublication.getLocalAudioTrack())) {
                this.audioTrackPublications.remove(localAudioTrackPublication);
                this.localAudioTrackPublications.remove(localAudioTrackPublication);
                localAudioTrackPublication.release();
                break;
            }
        }
    }
    
    private void removePublishedDataTrack(final LocalDataTrack localDataTrack) {
        for (final LocalDataTrackPublication localDataTrackPublication : this.localDataTrackPublications) {
            if (localDataTrack.equals(localDataTrackPublication.getLocalDataTrack())) {
                this.dataTrackPublications.remove(localDataTrackPublication);
                this.localDataTrackPublications.remove(localDataTrackPublication);
                localDataTrackPublication.release();
                break;
            }
        }
    }
    
    private void removePublishedVideoTrack(final LocalVideoTrack localVideoTrack) {
        for (final LocalVideoTrackPublication localVideoTrackPublication : this.localVideoTrackPublications) {
            if (localVideoTrack.equals(localVideoTrackPublication.getLocalVideoTrack())) {
                this.videoTrackPublications.remove(localVideoTrackPublication);
                this.localVideoTrackPublications.remove(localVideoTrackPublication);
                localVideoTrackPublication.release();
                break;
            }
        }
    }
    
    public List<AudioTrackPublication> getAudioTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends AudioTrackPublication>)this.audioTrackPublications);
        }
    }
    
    public List<DataTrackPublication> getDataTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends DataTrackPublication>)this.dataTrackPublications);
        }
    }
    
    public String getIdentity() {
        return this.identity;
    }
    
    public List<LocalAudioTrackPublication> getLocalAudioTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends LocalAudioTrackPublication>)this.localAudioTrackPublications);
        }
    }
    
    public List<LocalDataTrackPublication> getLocalDataTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends LocalDataTrackPublication>)this.localDataTrackPublications);
        }
    }
    
    public List<LocalVideoTrackPublication> getLocalVideoTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends LocalVideoTrackPublication>)this.localVideoTrackPublications);
        }
    }
    
    public NetworkQualityLevel getNetworkQualityLevel() {
        return this.networkQualityLevel;
    }
    
    public String getSid() {
        return this.sid;
    }
    
    public String getSignalingRegion() {
        return this.signalingRegion;
    }
    
    public Participant$State getState() {
        synchronized (this) {
            if (this.isReleased()) {
                return Participant$State.DISCONNECTED;
            }
            return this.nativeGetState(this.nativeLocalParticipantHandle);
        }
    }
    
    public List<VideoTrackPublication> getVideoTracks() {
        synchronized (this) {
            return Collections.unmodifiableList((List<? extends VideoTrackPublication>)this.videoTrackPublications);
        }
    }
    
    public boolean isReleased() {
        return this.nativeLocalParticipantHandle == 0L;
    }
    
    public boolean publishTrack(final LocalAudioTrack localAudioTrack) {
        synchronized (this) {
            return this.publishTrack(localAudioTrack, new LocalTrackPublicationOptions(TrackPriority.STANDARD));
        }
    }
    
    public boolean publishTrack(final LocalAudioTrack localAudioTrack, final LocalTrackPublicationOptions localTrackPublicationOptions) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localAudioTrack, (Object)"LocalAudioTrack must not be null");
            Preconditions.checkNotNull((Object)localTrackPublicationOptions, (Object)"LocalTrackPublicationOptions must not be null");
            final boolean released = localAudioTrack.isReleased();
            final boolean b = true;
            Preconditions.checkArgument(!released, (Object)"LocalAudioTrack must not be released");
            return !this.isReleased() && this.nativePublishAudioTrack(this.nativeLocalParticipantHandle, localAudioTrack, localTrackPublicationOptions, localAudioTrack.getNativeHandle()) && b;
        }
    }
    
    public boolean publishTrack(final LocalDataTrack localDataTrack) {
        synchronized (this) {
            return this.publishTrack(localDataTrack, new LocalTrackPublicationOptions(TrackPriority.STANDARD));
        }
    }
    
    public boolean publishTrack(final LocalDataTrack localDataTrack, final LocalTrackPublicationOptions localTrackPublicationOptions) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localDataTrack, (Object)"LocalDataTrack must not be null");
            Preconditions.checkNotNull((Object)localTrackPublicationOptions, (Object)"LocalTrackPublicationOptions must not be null");
            final boolean released = localDataTrack.isReleased();
            final boolean b = true;
            Preconditions.checkArgument(!released, (Object)"LocalDataTrack must not be released");
            return !this.isReleased() && this.nativePublishDataTrack(this.nativeLocalParticipantHandle, localDataTrack, localTrackPublicationOptions, localDataTrack.getNativeHandle()) && b;
        }
    }
    
    public boolean publishTrack(final LocalVideoTrack localVideoTrack) {
        synchronized (this) {
            return this.publishTrack(localVideoTrack, new LocalTrackPublicationOptions(TrackPriority.STANDARD));
        }
    }
    
    public boolean publishTrack(final LocalVideoTrack localVideoTrack, final LocalTrackPublicationOptions localTrackPublicationOptions) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localVideoTrack, (Object)"LocalVideoTrack must not be null");
            Preconditions.checkNotNull((Object)localTrackPublicationOptions, (Object)"LocalTrackPublicationOptions must not be null");
            final boolean released = localVideoTrack.isReleased();
            final boolean b = true;
            Preconditions.checkArgument(!released, (Object)"LocalVideoTrack must not be released");
            return !this.isReleased() && this.nativePublishVideoTrack(this.nativeLocalParticipantHandle, localVideoTrack, localTrackPublicationOptions, localVideoTrack.getNativeHandle()) && b;
        }
    }
    
    public void release() {
        synchronized (this) {
            if (!this.isReleased()) {
                final Iterator<LocalAudioTrackPublication> iterator = this.localAudioTrackPublications.iterator();
                while (iterator.hasNext()) {
                    iterator.next().release();
                }
                final Iterator<LocalDataTrackPublication> iterator2 = this.localDataTrackPublications.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().release();
                }
                final Iterator<LocalVideoTrackPublication> iterator3 = this.localVideoTrackPublications.iterator();
                while (iterator3.hasNext()) {
                    iterator3.next().release();
                }
                this.nativeRelease(this.nativeLocalParticipantHandle);
                this.nativeLocalParticipantHandle = 0L;
            }
        }
    }
    
    public void setEncodingParameters(final EncodingParameters encodingParameters) {
        synchronized (this) {
            if (!this.isReleased()) {
                this.nativeSetEncodingParameters(this.nativeLocalParticipantHandle, encodingParameters);
            }
            else {
                LocalParticipant.logger.w("Cannot set encoding parameters after disconnected from a room");
            }
        }
    }
    
    public void setListener(final LocalParticipant$Listener localParticipant$Listener) {
        Preconditions.checkNotNull((Object)localParticipant$Listener, (Object)"Listener must not be null");
        this.listenerReference.set(localParticipant$Listener);
    }
    
    public boolean unpublishTrack(final LocalAudioTrack localAudioTrack) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localAudioTrack, (Object)"LocalAudioTrack must not be null");
            Preconditions.checkArgument(!localAudioTrack.isReleased(), (Object)"LocalAudioTrack must not be released");
            if (this.isReleased()) {
                return false;
            }
            this.removePublishedAudioTrack(localAudioTrack);
            return this.nativeUnpublishAudioTrack(this.nativeLocalParticipantHandle, localAudioTrack.getNativeHandle());
        }
    }
    
    public boolean unpublishTrack(final LocalDataTrack localDataTrack) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localDataTrack, (Object)"LocalDataTrack must not be null");
            Preconditions.checkArgument(!localDataTrack.isReleased(), (Object)"LocalDataTrack must not be released");
            if (this.isReleased()) {
                return false;
            }
            this.removePublishedDataTrack(localDataTrack);
            return this.nativeUnpublishDataTrack(this.nativeLocalParticipantHandle, localDataTrack.getNativeHandle());
        }
    }
    
    public boolean unpublishTrack(final LocalVideoTrack localVideoTrack) {
        synchronized (this) {
            Preconditions.checkNotNull((Object)localVideoTrack, (Object)"LocalVideoTrack must not be null");
            Preconditions.checkArgument(!localVideoTrack.isReleased(), (Object)"LocalVideoTrack must not be released");
            if (this.isReleased()) {
                return false;
            }
            this.removePublishedVideoTrack(localVideoTrack);
            return this.nativeUnpublishVideoTrack(this.nativeLocalParticipantHandle, localVideoTrack.getNativeHandle());
        }
    }
}
