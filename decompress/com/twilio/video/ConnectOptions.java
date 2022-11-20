// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.video;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ConnectOptions
{
    private static final Set<Class> SUPPORTED_CODECS;
    private final String accessToken;
    private final List<LocalAudioTrack> audioTracks;
    private final BandwidthProfileOptions bandwidthProfile;
    private final List<LocalDataTrack> dataTracks;
    private final boolean enableAutomaticSubscription;
    private final boolean enableDominantSpeaker;
    private final boolean enableIceGatheringOnAnyAddressPorts;
    private final boolean enableInsights;
    private final boolean enableNetworkQuality;
    private final EncodingParameters encodingParameters;
    private final IceOptions iceOptions;
    private final MediaFactory mediaFactory;
    private final NetworkQualityConfiguration networkQualityConfiguration;
    private final List<AudioCodec> preferredAudioCodecs;
    private final List<VideoCodec> preferredVideoCodecs;
    private final String region;
    private final String roomName;
    private final List<LocalVideoTrack> videoTracks;
    
    static {
        SUPPORTED_CODECS = new HashSet<Class>(Arrays.asList(IsacCodec.class, OpusCodec.class, PcmuCodec.class, PcmaCodec.class, G722Codec.class, Vp8Codec.class, H264Codec.class, Vp9Codec.class));
    }
    
    private ConnectOptions(final Builder builder) {
        this.accessToken = Builder.a(builder);
        this.roomName = Builder.q(builder);
        this.audioTracks = Builder.b(builder);
        this.videoTracks = Builder.r(builder);
        this.dataTracks = Builder.d(builder);
        this.iceOptions = Builder.k(builder);
        this.enableIceGatheringOnAnyAddressPorts = Builder.g(builder);
        this.enableInsights = Builder.h(builder);
        this.enableAutomaticSubscription = Builder.e(builder);
        this.enableDominantSpeaker = Builder.f(builder);
        this.enableNetworkQuality = Builder.i(builder);
        this.networkQualityConfiguration = Builder.m(builder);
        this.preferredAudioCodecs = Builder.n(builder);
        this.preferredVideoCodecs = Builder.o(builder);
        this.region = Builder.p(builder);
        this.encodingParameters = Builder.j(builder);
        this.mediaFactory = Builder.l(builder);
        this.bandwidthProfile = Builder.c(builder);
    }
    
    public ConnectOptions(final Builder builder, final int n) {
        this(builder);
    }
    
    public static void checkAudioCodecs(final List<AudioCodec> list) {
        if (list != null) {
            for (final AudioCodec audioCodec : list) {
                Preconditions.checkNotNull((Object)audioCodec);
                Preconditions.checkArgument(ConnectOptions.SUPPORTED_CODECS.contains(audioCodec.getClass()), (Object)String.format("Unsupported audio codec %s", audioCodec.getName()));
            }
        }
    }
    
    public static void checkAudioTracksReleased(final List<LocalAudioTrack> list) {
        if (list != null) {
            final Iterator<LocalAudioTrack> iterator = list.iterator();
            while (iterator.hasNext()) {
                Preconditions.checkState(iterator.next().isReleased() ^ true, (Object)"LocalAudioTrack cannot be released");
            }
        }
    }
    
    public static void checkVideoCodecs(final List<VideoCodec> list) {
        if (list != null) {
            for (final VideoCodec videoCodec : list) {
                Preconditions.checkNotNull((Object)videoCodec);
                Preconditions.checkArgument(ConnectOptions.SUPPORTED_CODECS.contains(videoCodec.getClass()), (Object)String.format("Unsupported video codec %s", videoCodec.getName()));
            }
        }
    }
    
    public static void checkVideoTracksReleased(final List<LocalVideoTrack> list) {
        if (list != null) {
            final Iterator<LocalVideoTrack> iterator = list.iterator();
            while (iterator.hasNext()) {
                Preconditions.checkState(iterator.next().isReleased() ^ true, (Object)"LocalVideoTrack cannot be released");
            }
        }
    }
    
    private long createNativeConnectOptionsBuilder() {
        checkAudioTracksReleased(this.audioTracks);
        checkVideoTracksReleased(this.videoTracks);
        return this.nativeCreate(this.accessToken, this.roomName, this.getLocalAudioTracksArray(), this.getLocalVideoTracksArray(), this.getLocalDataTracksArray(), this.iceOptions, this.enableIceGatheringOnAnyAddressPorts, this.enableInsights, this.enableAutomaticSubscription, this.enableDominantSpeaker, this.enableNetworkQuality, this.networkQualityConfiguration, PlatformInfo.getNativeHandle(), this.getAudioCodecsArray(), this.getVideoCodecsArray(), this.region, this.encodingParameters, this.bandwidthProfile);
    }
    
    private AudioCodec[] getAudioCodecsArray() {
        final AudioCodec[] array = new AudioCodec[0];
        final List<AudioCodec> preferredAudioCodecs = this.preferredAudioCodecs;
        AudioCodec[] array2 = array;
        if (preferredAudioCodecs != null) {
            array2 = array;
            if (!preferredAudioCodecs.isEmpty()) {
                array2 = this.preferredAudioCodecs.toArray(new AudioCodec[this.preferredAudioCodecs.size()]);
            }
        }
        return array2;
    }
    
    private LocalAudioTrack[] getLocalAudioTracksArray() {
        final LocalAudioTrack[] array = new LocalAudioTrack[0];
        final List<LocalAudioTrack> audioTracks = this.audioTracks;
        LocalAudioTrack[] array2 = array;
        if (audioTracks != null) {
            array2 = array;
            if (audioTracks.size() > 0) {
                array2 = this.audioTracks.toArray(new LocalAudioTrack[this.audioTracks.size()]);
            }
        }
        return array2;
    }
    
    private LocalDataTrack[] getLocalDataTracksArray() {
        final LocalDataTrack[] array = new LocalDataTrack[0];
        final List<LocalDataTrack> dataTracks = this.dataTracks;
        LocalDataTrack[] array2 = array;
        if (dataTracks != null) {
            array2 = array;
            if (dataTracks.size() > 0) {
                array2 = this.dataTracks.toArray(new LocalDataTrack[this.dataTracks.size()]);
            }
        }
        return array2;
    }
    
    private LocalVideoTrack[] getLocalVideoTracksArray() {
        final LocalVideoTrack[] array = new LocalVideoTrack[0];
        final List<LocalVideoTrack> videoTracks = this.videoTracks;
        LocalVideoTrack[] array2 = array;
        if (videoTracks != null) {
            array2 = array;
            if (videoTracks.size() > 0) {
                array2 = this.videoTracks.toArray(new LocalVideoTrack[this.videoTracks.size()]);
            }
        }
        return array2;
    }
    
    private VideoCodec[] getVideoCodecsArray() {
        final VideoCodec[] array = new VideoCodec[0];
        final List<VideoCodec> preferredVideoCodecs = this.preferredVideoCodecs;
        VideoCodec[] array2 = array;
        if (preferredVideoCodecs != null) {
            array2 = array;
            if (!preferredVideoCodecs.isEmpty()) {
                array2 = this.preferredVideoCodecs.toArray(new VideoCodec[this.preferredVideoCodecs.size()]);
            }
        }
        return array2;
    }
    
    private native long nativeCreate(final String p0, final String p1, final LocalAudioTrack[] p2, final LocalVideoTrack[] p3, final LocalDataTrack[] p4, final IceOptions p5, final boolean p6, final boolean p7, final boolean p8, final boolean p9, final boolean p10, final NetworkQualityConfiguration p11, final long p12, final AudioCodec[] p13, final VideoCodec[] p14, final String p15, final EncodingParameters p16, final BandwidthProfileOptions p17);
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ConnectOptions connectOptions = (ConnectOptions)o;
            return this.enableIceGatheringOnAnyAddressPorts == connectOptions.enableIceGatheringOnAnyAddressPorts && this.enableInsights == connectOptions.enableInsights && this.enableAutomaticSubscription == connectOptions.enableAutomaticSubscription && this.enableDominantSpeaker == connectOptions.enableDominantSpeaker && this.enableNetworkQuality == connectOptions.enableNetworkQuality && this.accessToken.equals(connectOptions.accessToken) && Util.equals((Object)this.roomName, (Object)connectOptions.roomName) && Util.equals((Object)this.region, (Object)connectOptions.region) && Util.equals((Object)this.audioTracks, (Object)connectOptions.audioTracks) && Util.equals((Object)this.videoTracks, (Object)connectOptions.videoTracks) && Util.equals((Object)this.dataTracks, (Object)connectOptions.dataTracks) && Util.equals((Object)this.iceOptions, (Object)connectOptions.iceOptions) && Util.equals((Object)this.networkQualityConfiguration, (Object)connectOptions.networkQualityConfiguration) && Util.equals((Object)this.preferredAudioCodecs, (Object)connectOptions.preferredAudioCodecs) && Util.equals((Object)this.preferredVideoCodecs, (Object)connectOptions.preferredVideoCodecs) && Util.equals((Object)this.encodingParameters, (Object)connectOptions.encodingParameters) && Util.equals((Object)this.bandwidthProfile, (Object)connectOptions.bandwidthProfile) && Util.equals((Object)this.mediaFactory, (Object)connectOptions.mediaFactory);
        }
        return false;
    }
    
    public String getAccessToken() {
        return this.accessToken;
    }
    
    public List<LocalAudioTrack> getAudioTracks() {
        return this.audioTracks;
    }
    
    public BandwidthProfileOptions getBandwidthProfile() {
        return this.bandwidthProfile;
    }
    
    public List<LocalDataTrack> getDataTracks() {
        return this.dataTracks;
    }
    
    public EncodingParameters getEncodingParameters() {
        return this.encodingParameters;
    }
    
    public IceOptions getIceOptions() {
        return this.iceOptions;
    }
    
    public MediaFactory getMediaFactory() {
        return this.mediaFactory;
    }
    
    public NetworkQualityConfiguration getNetworkQualityConfiguration() {
        return this.networkQualityConfiguration;
    }
    
    public String getRegion() {
        return this.region;
    }
    
    public String getRoomName() {
        return this.roomName;
    }
    
    public List<LocalVideoTrack> getVideoTracks() {
        return this.videoTracks;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.accessToken.hashCode();
        final String roomName = this.roomName;
        int hashCode2 = 0;
        int hashCode3;
        if (roomName != null) {
            hashCode3 = roomName.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String region = this.region;
        int hashCode4;
        if (region != null) {
            hashCode4 = region.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final List<LocalAudioTrack> audioTracks = this.audioTracks;
        int hashCode5;
        if (audioTracks != null) {
            hashCode5 = audioTracks.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final List<LocalVideoTrack> videoTracks = this.videoTracks;
        int hashCode6;
        if (videoTracks != null) {
            hashCode6 = videoTracks.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final List<LocalDataTrack> dataTracks = this.dataTracks;
        int hashCode7;
        if (dataTracks != null) {
            hashCode7 = dataTracks.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final IceOptions iceOptions = this.iceOptions;
        int hashCode8;
        if (iceOptions != null) {
            hashCode8 = iceOptions.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int enableIceGatheringOnAnyAddressPorts = this.enableIceGatheringOnAnyAddressPorts ? 1 : 0;
        final int enableInsights = this.enableInsights ? 1 : 0;
        final int enableAutomaticSubscription = this.enableAutomaticSubscription ? 1 : 0;
        final int enableDominantSpeaker = this.enableDominantSpeaker ? 1 : 0;
        final int enableNetworkQuality = this.enableNetworkQuality ? 1 : 0;
        final NetworkQualityConfiguration networkQualityConfiguration = this.networkQualityConfiguration;
        int hashCode9;
        if (networkQualityConfiguration != null) {
            hashCode9 = networkQualityConfiguration.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final List<AudioCodec> preferredAudioCodecs = this.preferredAudioCodecs;
        int hashCode10;
        if (preferredAudioCodecs != null) {
            hashCode10 = preferredAudioCodecs.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final List<VideoCodec> preferredVideoCodecs = this.preferredVideoCodecs;
        int hashCode11;
        if (preferredVideoCodecs != null) {
            hashCode11 = preferredVideoCodecs.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final EncodingParameters encodingParameters = this.encodingParameters;
        int hashCode12;
        if (encodingParameters != null) {
            hashCode12 = encodingParameters.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final BandwidthProfileOptions bandwidthProfile = this.bandwidthProfile;
        int hashCode13;
        if (bandwidthProfile != null) {
            hashCode13 = bandwidthProfile.hashCode();
        }
        else {
            hashCode13 = 0;
        }
        final MediaFactory mediaFactory = this.mediaFactory;
        if (mediaFactory != null) {
            hashCode2 = mediaFactory.hashCode();
        }
        return ((((((((((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + enableIceGatheringOnAnyAddressPorts) * 31 + enableInsights) * 31 + enableAutomaticSubscription) * 31 + enableDominantSpeaker) * 31 + enableNetworkQuality) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode2;
    }
    
    public boolean isIceGatheringOnAnyAddressPortsEnabled() {
        return this.enableIceGatheringOnAnyAddressPorts;
    }
    
    public boolean isInsightsEnabled() {
        return this.enableInsights;
    }
    
    public boolean isNetworkQualityEnabled() {
        return this.enableNetworkQuality;
    }
    
    public static class Builder
    {
        private String accessToken;
        private List<LocalAudioTrack> audioTracks;
        private BandwidthProfileOptions bandwidthProfile;
        private List<LocalDataTrack> dataTracks;
        private boolean enableAutomaticSubscription;
        private boolean enableDominantSpeaker;
        private boolean enableIceGatheringOnAnyAddressPorts;
        private boolean enableInsights;
        private boolean enableNetworkQuality;
        private EncodingParameters encodingParameters;
        private IceOptions iceOptions;
        private MediaFactory mediaFactory;
        private NetworkQualityConfiguration networkQualityConfiguration;
        private List<AudioCodec> preferredAudioCodecs;
        private List<VideoCodec> preferredVideoCodecs;
        private String region;
        private String roomName;
        private List<LocalVideoTrack> videoTracks;
        
        public Builder(final String accessToken) {
            this.accessToken = "";
            this.roomName = "";
            this.enableIceGatheringOnAnyAddressPorts = false;
            this.enableInsights = true;
            this.enableAutomaticSubscription = true;
            this.enableDominantSpeaker = false;
            this.enableNetworkQuality = false;
            this.region = "gll";
            Preconditions.checkNotNull((Object)accessToken);
            this.accessToken = accessToken;
        }
        
        public static /* bridge */ String a(final Builder builder) {
            return builder.accessToken;
        }
        
        public static /* bridge */ List b(final Builder builder) {
            return builder.audioTracks;
        }
        
        public static /* bridge */ BandwidthProfileOptions c(final Builder builder) {
            return builder.bandwidthProfile;
        }
        
        public static /* bridge */ List d(final Builder builder) {
            return builder.dataTracks;
        }
        
        public static /* bridge */ boolean e(final Builder builder) {
            return builder.enableAutomaticSubscription;
        }
        
        public static /* bridge */ boolean f(final Builder builder) {
            return builder.enableDominantSpeaker;
        }
        
        public static /* bridge */ boolean g(final Builder builder) {
            return builder.enableIceGatheringOnAnyAddressPorts;
        }
        
        public static /* bridge */ boolean h(final Builder builder) {
            return builder.enableInsights;
        }
        
        public static /* bridge */ boolean i(final Builder builder) {
            return builder.enableNetworkQuality;
        }
        
        public static /* bridge */ EncodingParameters j(final Builder builder) {
            return builder.encodingParameters;
        }
        
        public static /* bridge */ IceOptions k(final Builder builder) {
            return builder.iceOptions;
        }
        
        public static /* bridge */ MediaFactory l(final Builder builder) {
            return builder.mediaFactory;
        }
        
        public static /* bridge */ NetworkQualityConfiguration m(final Builder builder) {
            return builder.networkQualityConfiguration;
        }
        
        public static /* bridge */ List n(final Builder builder) {
            return builder.preferredAudioCodecs;
        }
        
        public static /* bridge */ List o(final Builder builder) {
            return builder.preferredVideoCodecs;
        }
        
        public static /* bridge */ String p(final Builder builder) {
            return builder.region;
        }
        
        public static /* bridge */ String q(final Builder builder) {
            return builder.roomName;
        }
        
        public static /* bridge */ List r(final Builder builder) {
            return builder.videoTracks;
        }
        
        public Builder audioTracks(final List<LocalAudioTrack> list) {
            Preconditions.checkNotNull((Object)list, (Object)"LocalAudioTrack List must not be null");
            this.audioTracks = new ArrayList<LocalAudioTrack>(list);
            return this;
        }
        
        public Builder bandwidthProfile(final BandwidthProfileOptions bandwidthProfile) {
            this.bandwidthProfile = bandwidthProfile;
            return this;
        }
        
        public ConnectOptions build() {
            Preconditions.checkNotNull((Object)this.accessToken, (Object)"Token must not be null.");
            Preconditions.checkArgument(this.accessToken.equals("") ^ true, (Object)"Token must not be empty.");
            ConnectOptions.checkAudioTracksReleased(this.audioTracks);
            ConnectOptions.checkVideoTracksReleased(this.videoTracks);
            ConnectOptions.checkAudioCodecs(this.preferredAudioCodecs);
            ConnectOptions.checkVideoCodecs(this.preferredVideoCodecs);
            return new ConnectOptions(this, 0);
        }
        
        public Builder dataTracks(final List<LocalDataTrack> dataTracks) {
            Preconditions.checkNotNull((Object)dataTracks);
            this.dataTracks = dataTracks;
            return this;
        }
        
        public Builder enableAutomaticSubscription(final boolean enableAutomaticSubscription) {
            this.enableAutomaticSubscription = enableAutomaticSubscription;
            return this;
        }
        
        public Builder enableDominantSpeaker(final boolean enableDominantSpeaker) {
            this.enableDominantSpeaker = enableDominantSpeaker;
            return this;
        }
        
        public Builder enableIceGatheringOnAnyAddressPorts(final boolean enableIceGatheringOnAnyAddressPorts) {
            this.enableIceGatheringOnAnyAddressPorts = enableIceGatheringOnAnyAddressPorts;
            return this;
        }
        
        public Builder enableInsights(final boolean enableInsights) {
            this.enableInsights = enableInsights;
            return this;
        }
        
        public Builder enableNetworkQuality(final boolean enableNetworkQuality) {
            this.enableNetworkQuality = enableNetworkQuality;
            return this;
        }
        
        public Builder encodingParameters(final EncodingParameters encodingParameters) {
            Preconditions.checkNotNull((Object)encodingParameters);
            this.encodingParameters = encodingParameters;
            return this;
        }
        
        public Builder iceOptions(final IceOptions iceOptions) {
            Preconditions.checkNotNull((Object)iceOptions);
            this.iceOptions = iceOptions;
            return this;
        }
        
        public Builder mediaFactory(final MediaFactory mediaFactory) {
            this.mediaFactory = mediaFactory;
            return this;
        }
        
        public Builder networkQualityConfiguration(final NetworkQualityConfiguration networkQualityConfiguration) {
            Preconditions.checkNotNull((Object)networkQualityConfiguration);
            this.networkQualityConfiguration = networkQualityConfiguration;
            return this;
        }
        
        public Builder preferAudioCodecs(final List<AudioCodec> list) {
            Preconditions.checkNotNull((Object)list);
            this.preferredAudioCodecs = new ArrayList<AudioCodec>(list);
            return this;
        }
        
        public Builder preferVideoCodecs(final List<VideoCodec> list) {
            Preconditions.checkNotNull((Object)list);
            this.preferredVideoCodecs = new ArrayList<VideoCodec>(list);
            return this;
        }
        
        public Builder region(final String region) {
            this.region = region;
            return this;
        }
        
        public Builder roomName(final String roomName) {
            Preconditions.checkNotNull((Object)roomName);
            this.roomName = roomName;
            return this;
        }
        
        public Builder videoTracks(final List<LocalVideoTrack> list) {
            Preconditions.checkNotNull((Object)list, (Object)"LocalVideoTrack List must not be null");
            this.videoTracks = new ArrayList<LocalVideoTrack>(list);
            return this;
        }
    }
}
