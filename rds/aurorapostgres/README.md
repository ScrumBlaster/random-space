
   1. A set of AWS CloudFormation samples to deploy an Amazon Aurora DB cluster based on AWS security and high availability best practices.
  
   2. Python based source code to bootstrap the database upon creation using AWS Lambda.

 I broke the CloudFormation templates into the following three stacks.

1. CloudFormation template to set up VPC, subnets, route tables, internet gateway, NAT gateway, S3 gateway endpoint, AWS Secrets Manager interface endpoint, and other networking components.

2. CloudFormation template to set up an Amazon Linux bastion host in an Auto Scaling group to connect to the Aurora PostgreSQL DB cluster.

3. loudFormation template to set up Aurora PostgreSQL DB cluster with master user password stored in AWS Secrets Manager and bootstrap the database using AWS Lambda.

The stacks are integrated using exported output values. Using three different CloudFormation stacks instead of one nested stack gives you some flexibility. For example, you can choose to deploy the VPC and bastion host CloudFormation stacks once and Aurora PostgreSQL DB cluster CloudFormation stack multiple times in an AWS Region.

