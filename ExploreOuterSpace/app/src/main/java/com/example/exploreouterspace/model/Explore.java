package com.example.exploreouterspace.model;

import java.util.List;

public class Explore {
    public static class Fairings {
        private boolean reused;
        private boolean recovery_attempt;
        private boolean recovered;
        private List<String> ships;

        public boolean isReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }

        public boolean isRecoveryAttempt() {
            return recovery_attempt;
        }

        public void setRecoveryAttempt(boolean recovery_attempt) {
            this.recovery_attempt = recovery_attempt;
        }

        public boolean isRecovered() {
            return recovered;
        }

        public void setRecovered(boolean recovered) {
            this.recovered = recovered;
        }

        public List<String> getShips() {
            return ships;
        }

        public void setShips(List<String> ships) {
            this.ships = ships;
        }
    }

    public static class Patch {
        private String small;
        private String large;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }
    }

    public static class Reddit {
        private String campaign;
        private String launch;
        private String media;
        private String recovery;

        public String getCampaign() {
            return campaign;
        }

        public void setCampaign(String campaign) {
            this.campaign = campaign;
        }

        public String getLaunch() {
            return launch;
        }

        public void setLaunch(String launch) {
            this.launch = launch;
        }

        public String getMedia() {
            return media;
        }

        public void setMedia(String media) {
            this.media = media;
        }

        public String getRecovery() {
            return recovery;
        }

        public void setRecovery(String recovery) {
            this.recovery = recovery;
        }
    }

    public static class Flickr {
        private List<String> small;
        private List<String> original;

        public List<String> getSmall() {
            return small;
        }

        public void setSmall(List<String> small) {
            this.small = small;
        }

        public List<String> getOriginal() {
            return original;
        }

        public void setOriginal(List<String> original) {
            this.original = original;
        }
    }

    public static class Links {
        private Patch patch;
        private Reddit reddit;
        private Flickr flickr;
        private String presskit;
        private String webcast;
        private String youtube_id;
        private String article;
        private String wikipedia;

        public Patch getPatch() {
            return patch;
        }

        public void setPatch(Patch patch) {
            this.patch = patch;
        }

        public Reddit getReddit() {
            return reddit;
        }

        public void setReddit(Reddit reddit) {
            this.reddit = reddit;
        }

        public Flickr getFlickr() {
            return flickr;
        }

        public void setFlickr(Flickr flickr) {
            this.flickr = flickr;
        }

        public String getPresskit() {
            return presskit;
        }

        public void setPresskit(String presskit) {
            this.presskit = presskit;
        }

        public String getWebcast() {
            return webcast;
        }

        public void setWebcast(String webcast) {
            this.webcast = webcast;
        }

        public String getYoutube_id() {
            return youtube_id;
        }

        public void setYoutube_id(String youtube_id) {
            this.youtube_id = youtube_id;
        }

        public String getArticle() {
            return article;
        }

        public void setArticle(String article) {
            this.article = article;
        }

        public String getWikipedia() {
            return wikipedia;
        }

        public void setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
        }
    }

    public static class Failure {
        private int time;
        private Integer altitude;
        private String reason;

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public Integer getAltitude() {
            return altitude;
        }

        public void setAltitude(Integer altitude) {
            this.altitude = altitude;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    public static class Core {
        private String core;
        private int flight;
        private boolean gridfins;
        private boolean legs;
        private boolean reused;
        private boolean landing_attempt;
        private Boolean landing_success;
        private String landing_type;

        public String getCore() {
            return core;
        }

        public void setCore(String core) {
            this.core = core;
        }

        public int getFlight() {
            return flight;
        }

        public void setFlight(int flight) {
            this.flight = flight;
        }

        public boolean isGridfins() {
            return gridfins;
        }

        public void setGridfins(boolean gridfins) {
            this.gridfins = gridfins;
        }

        public boolean isLegs() {
            return legs;
        }

        public void setLegs(boolean legs) {
            this.legs = legs;
        }

        public boolean isReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }

        public boolean isLanding_attempt() {
            return landing_attempt;
        }

        public void setLanding_attempt(boolean landing_attempt) {
            this.landing_attempt = landing_attempt;
        }

        public Boolean getLanding_success() {
            return landing_success;
        }

        public void setLanding_success(Boolean landing_success) {
            this.landing_success = landing_success;
        }

        public String getLanding_type() {
            return landing_type;
        }

        public void setLanding_type(String landing_type) {
            this.landing_type = landing_type;
        }

        public String getLandpad() {
            return landpad;
        }

        public void setLandpad(String landpad) {
            this.landpad = landpad;
        }

        private String landpad;

    }

    private Fairings fairings;
    private Links links;
    private String static_fire_date_utc;
    private long static_fire_date_unix;
    private boolean net;
    private int window;
    private String rocket;
    private boolean success;
    private List<Failure> failures;
    private String details;
    private List<String> crew;
    private List<String> ships;
    private List<String> capsules;
    private List<String> payloads;
    private String launchpad;
    private int flight_number;
    private String name;
    private String date_utc;
    private long date_unix;
    private String date_local;
    private String date_precision;
    private boolean upcoming;
    private List<Core> cores;
    private boolean auto_update;
    private boolean tbd;
    private String launch_library_id;
    private String id;

    public Fairings getFairings() {
        return fairings;
    }

    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }

    public void setStatic_fire_date_utc(String static_fire_date_utc) {
        this.static_fire_date_utc = static_fire_date_utc;
    }

    public long getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }

    public void setStatic_fire_date_unix(long static_fire_date_unix) {
        this.static_fire_date_unix = static_fire_date_unix;
    }

    public boolean isNet() {
        return net;
    }

    public void setNet(boolean net) {
        this.net = net;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public String getRocket() {
        return rocket;
    }

    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Failure> getFailures() {
        return failures;
    }

    public void setFailures(List<Failure> failures) {
        this.failures = failures;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<String> getCrew() {
        return crew;
    }

    public void setCrew(List<String> crew) {
        this.crew = crew;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public List<String> getCapsules() {
        return capsules;
    }

    public void setCapsules(List<String> capsules) {
        this.capsules = capsules;
    }

    public List<String> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    public String getLaunchpad() {
        return launchpad;
    }

    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_utc() {
        return date_utc;
    }

    public void setDate_utc(String date_utc) {
        this.date_utc = date_utc;
    }

    public long getDate_unix() {
        return date_unix;
    }

    public void setDate_unix(long date_unix) {
        this.date_unix = date_unix;
    }

    public String getDate_local() {
        return date_local;
    }

    public void setDate_local(String date_local) {
        this.date_local = date_local;
    }

    public String getDate_precision() {
        return date_precision;
    }

    public void setDate_precision(String date_precision) {
        this.date_precision = date_precision;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public List<Core> getCores() {
        return cores;
    }

    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    public boolean isAuto_update() {
        return auto_update;
    }

    public void setAuto_update(boolean auto_update) {
        this.auto_update = auto_update;
    }

    public boolean isTbd() {
        return tbd;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public String getLaunch_library_id() {
        return launch_library_id;
    }

    public void setLaunch_library_id(String launch_library_id) {
        this.launch_library_id = launch_library_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
