package com.company;

public class CloudRun {
    /*
     gcloud auth list project
    5  gcloud config list project
    6  gcloud services enable run.googleapis.com
    7  gcloud config set compute/region us-central1
    8  LOCATION="us-central1"
    9  mkdir helloworld && cd helloworld
   10  clear
   11  vim package.json
   12  vim index.js
   13  vim Dockerfile
   14  gcloud builds submit --tag gcr.io/$GOOGLE_CLOUD_PROJECT/helloworld
   17  gcloud container images list
   18  docker run -d -p 8080:8080 gcr.io/$GOOGLE_CLOUD_PROJECT/helloworld
   19  gcloud run deploy --image gcr.io/$GOOGLE_CLOUD_PROJECT/helloworld --allow-unauthenticated --region=$LOCATION
   20  gcloud container images delete gcr.io/$GOOGLE_CLOUD_PROJECT/helloword
     */
}
