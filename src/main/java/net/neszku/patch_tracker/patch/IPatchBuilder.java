package net.neszku.patch_tracker.patch;

import net.neszku.patch_tracker.game.Game;

import java.time.LocalDateTime;

public interface IPatchBuilder {

    URLBuilder game(Game game);

    interface URLBuilder {
        TitleBuilder url(String url);
    }

    interface TitleBuilder {
        ContentBuilder title(String title);
    }

    interface ContentBuilder {
        FormatBuilder rawContent(String rawContent);
    }

    interface FormatBuilder {
        BannerBuilder format(Format format);
    }

    interface BannerBuilder {
        PublicationDateBuilder bannerURL(String bannerURL);
    }

    interface PublicationDateBuilder {
        IPatch publicationDate(LocalDateTime publicationDate);
    }

}
