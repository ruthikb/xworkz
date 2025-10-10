package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.generatedata.SpotifyDto;
import com.xworkz.spotifyapp.spotify.SpotifyGenerate;

public class SpotifyRunner {

        public static void main(String[] args) {
            SpotifyDto spotify = new SpotifyDto();
            spotify.setSongTitle("Shape of you");
            spotify.setArtist("Ed Sheeran");
            spotify.setAlbum("Divide");
            spotify.setDurationInSeconds(263);
            spotify.setGenre("Pop");
            spotify.setIsFavorite(true);

            SpotifyGenerate spotifyApp = new SpotifyGenerate();
            spotifyApp.addToPlaylist(spotify);
        }
    }


