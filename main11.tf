provider "aws" {
  region = "us-east-1"
  access_key = "access-key"
  secret_key = "secret-access-key"
}

# resource "random_pet" "pet_name" {
#     length = 3
#     separator = "_"
# }

# resource "aws_s3_bucket" "pet_bucket" {
#   bucket ="${random_pet.pet_name.id}-bucket"
#   acl = "private"
# }

resource "random_pet" "bucket_name" {
  length = 2
}

resource "aws_s3_bucket" "example" {
  bucket = "my-bucket-${random_pet.bucket_name.id}"
  # other bucket configuration
}
output "neededForJenkins" {
  value = aws_s3_bucket.example.id
}
