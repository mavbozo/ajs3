(ns ajs3.core
  (:import (com.amazonaws.regions Regions)
           (com.amazonaws HttpMethod)
           (com.amazonaws.auth BasicAWSCredentials)
           (com.amazonaws.auth AWSStaticCredentialsProvider)
           (com.amazonaws.services.s3 AmazonS3)
           (com.amazonaws.services.s3 AmazonS3ClientBuilder)
           (com.amazonaws.services.s3.model GeneratePresignedUrlRequest)
           (java.time Instant)
           (java.time.temporal ChronoUnit)))

(comment

  (def access-key-id "")
  (def secret-access-key "")
  (def region Regions/AP_SOUTHEAST_1)

  (def aws-creds (BasicAWSCredentials. access-key-id secret-access-key))

  (def s3Client (let [x (doto (AmazonS3ClientBuilder/standard)
                          (.withCredentials (AWSStaticCredentialsProvider. aws-creds)))]
                  (.build x)))

  (def gpur (doto (GeneratePresignedUrlRequest. "mavbozo1" "test.txt")
              (.withMethod HttpMethod/PUT)
              (.withExpiration (java.util.Date/from
                                (.plus (Instant/now)
                                       5
                                       ChronoUnit/MINUTES)))))

  (str (.generatePresignedUrl s3Client gpur))

  ;; AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
  ;;                         .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
  ;;                         .build();
  

  )

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
