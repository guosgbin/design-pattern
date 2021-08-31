package cn.guosgbin.pattern.memento.white;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/26 23:48
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
public class PublishInfo {
    // jar包路径
    private String jarFile;
    // 版本
    private String version;
    // 发布时间
    private LocalDateTime publishTime;


    public static final class PublishInfoBuilder {
        // jar包路径
        private String jarFile;
        // 版本
        private String version;
        // 发布时间
        private LocalDateTime publishTime;

        private PublishInfoBuilder() {
        }

        public static PublishInfoBuilder getBuilder() {
            return new PublishInfoBuilder();
        }

        public PublishInfoBuilder jarFile(String jarFile) {
            this.jarFile = jarFile;
            return this;
        }

        public PublishInfoBuilder version(String version) {
            this.version = version;
            return this;
        }

        public PublishInfoBuilder publishTime(LocalDateTime publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        public PublishInfo build() {
            PublishInfo publishInfo = new PublishInfo();
            publishInfo.setJarFile(jarFile);
            publishInfo.setVersion(version);
            publishInfo.setPublishTime(publishTime);
            return publishInfo;
        }
    }
}
