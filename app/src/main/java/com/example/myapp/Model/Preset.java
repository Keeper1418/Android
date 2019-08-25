package com.example.myapp.Model;

import java.util.*;

public class Preset {
        private String id;
        private String name;
        private String orderBy;
        private String version;
        private Long tempo;
        private String icon;
        private Long price;
        private Boolean hasInfo;
        private String imagePreview1;
        private List<String> tags;
        private Map<String, File> files;
        private Boolean deleted;
        private String author;
        private Long difficulty;
        private String audioPreview1URL;
        private String audioPreview1Name;
        private String videoPreview;
        private String audioPreview2URL;
        private String audioPreview2Name;
        private String videoTutorial;

        public String getID() { return id; }
        public void setID(String value) { this.id = value; }

        public String getName() { return name; }
        public void setName(String value) { this.name = value; }

        public String getOrderBy() { return orderBy; }
        public void setOrderBy(String value) { this.orderBy = value; }

        public String getVersion() { return version; }
        public void setVersion(String value) { this.version = value; }

        public Long getTempo() { return tempo; }
        public void setTempo(Long value) { this.tempo = value; }

        public String getIcon() { return icon; }
        public void setIcon(String value) { this.icon = value; }

        public Long getPrice() { return price; }
        public void setPrice(Long value) { this.price = value; }

        public Boolean getHasInfo() { return hasInfo; }
        public void setHasInfo(Boolean value) { this.hasInfo = value; }

        public String getImagePreview1() { return imagePreview1; }
        public void setImagePreview1(String value) { this.imagePreview1 = value; }

        public List<String> getTags() { return tags; }
        public void setTags(List<String> value) { this.tags = value; }

        public Map<String, File> getFiles() { return files; }
        public void setFiles(Map<String, File> value) { this.files = value; }

        public Boolean getDeleted() { return deleted; }
        public void setDeleted(Boolean value) { this.deleted = value; }

        public String getAuthor() { return author; }
        public void setAuthor(String value) { this.author = value; }

        public Long getDifficulty() { return difficulty; }
        public void setDifficulty(Long value) { this.difficulty = value; }

        public String getAudioPreview1URL() { return audioPreview1URL; }
        public void setAudioPreview1URL(String value) { this.audioPreview1URL = value; }

        public String getAudioPreview1Name() { return audioPreview1Name; }
        public void setAudioPreview1Name(String value) { this.audioPreview1Name = value; }

        public String getVideoPreview() { return videoPreview; }
        public void setVideoPreview(String value) { this.videoPreview = value; }

        public String getAudioPreview2URL() { return audioPreview2URL; }
        public void setAudioPreview2URL(String value) { this.audioPreview2URL = value; }

        public String getAudioPreview2Name() { return audioPreview2Name; }
        public void setAudioPreview2Name(String value) { this.audioPreview2Name = value; }

        public String getVideoTutorial() { return videoTutorial; }
        public void setVideoTutorial(String value) { this.videoTutorial = value; }
}
