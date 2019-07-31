package com.example.wallpaperhd;

import com.example.wallpaperhd.modelCategory.Category;
import com.example.wallpaperhd.modelMedia.Media;
import com.example.wallpaperhd.modelPost.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PolyService {
    //http://asian.dotplays.com/wp-json/wp/v2/posts?category=18&per_page=5&paging=1

    @GET("wp-json/wp/v2/categories")
    Call<List<Category>> getCategories(@Query("page") String page,
                                       @Query("per_page") String per_page
    );

    @GET("wp-json/wp/v2/posts")
    Call<List<Post>> getPostOfCategory(@Query("category") String categoryID,
                                       @Query("per_page") String per_page,
                                       @Query("paging") String paging
    );

    @GET("wp-json/wp/v2/media")
    Call<List<Media>> getMediaofPost(@Query("parent") String parent
    );
}
