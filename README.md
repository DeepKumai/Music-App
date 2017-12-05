Designed a interactive music playlist. NOTE that no GUI programming is implemented.
Music app invocation perform:
1. Enter the name of the music playlist which must exist in the working directory. Read in
   the music playlist from its binary file.
2. Display the number of songs stored within the playlist.
3. Provide the user a menu with options to
      a. Add​ a new song in playlist. Display the number of songs in playlist after adding
         song. Assume that name of songs in playlist should be unique.
      b. Delete​ a song from playlist by song’s name. Display an error message if name of
         song does not exist else display the number of songs in playlist after deleting
         song.
      c. Search​ for a song in playlist by song’s name. Display an error message if name
         of song does not exist else display complete information of the song.
      d. Show​ all songs in the playlist with their complete information. If no song exist,
         display “No Song Exist”.
      e. Back​ ​to​ ​menu​ option where all playlists in the current directory is shown.(Step 1)
      f. Exit​ the app option.
4. Serialize the entire updated playlist to its file in the current directory.
   Information of a song is represented by song name, singer, song’s duration (in seconds).
   
Implemented Serializable to implement an individual song entry in
the playlist
