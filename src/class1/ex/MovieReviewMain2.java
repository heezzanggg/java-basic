package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
//        출력예시
//        영화 제목: "인셉션", 리뷰: "인생은 무한 루프"
//        영화 제목: "어바웃 타임", 리뷰: "인생 시간 영화!"

        //영화 리뷰 정보 선언
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        movieReviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";
        movieReviews[1] = movieReview2;


        //영화 리뷰 정보 출력
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: \"" +movieReview.title + "\", 리뷰: \"" + movieReview.review+"\"");
        }


    }
}
